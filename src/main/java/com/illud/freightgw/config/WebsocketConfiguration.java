package com.illud.freightgw.config;

import com.illud.freightgw.domain.Authority;
import com.illud.freightgw.domain.User;
import com.illud.freightgw.repository.UserRepository;
import com.illud.freightgw.security.AuthoritiesConstants;
import com.illud.freightgw.security.SecurityUtils;

import java.security.Principal;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.*;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.*;
import org.springframework.web.socket.server.HandshakeInterceptor;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

import io.github.jhipster.config.JHipsterProperties;

@Configuration
@EnableWebSocketMessageBroker
public class WebsocketConfiguration implements WebSocketMessageBrokerConfigurer {

    public static final String IP_ADDRESS = "IP_ADDRESS";

    private final JHipsterProperties jHipsterProperties;
    
    @Autowired
  	UserRepository userRepository;


    public WebsocketConfiguration(JHipsterProperties jHipsterProperties) {
        this.jHipsterProperties = jHipsterProperties;
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        String[] allowedOrigins = Optional.ofNullable(jHipsterProperties.getCors().getAllowedOrigins()).map(origins -> origins.toArray(new String[0])).orElse(new String[0]);
        registry.addEndpoint("/websocket/tracker")
            .setHandshakeHandler(defaultHandshakeHandler())
            .setAllowedOrigins(allowedOrigins)
            .withSockJS()
            .setInterceptors(httpSessionHandshakeInterceptor());
    }

    @Bean
    public HandshakeInterceptor httpSessionHandshakeInterceptor() {
        return new HandshakeInterceptor() {

            @Override
            public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
                if (request instanceof ServletServerHttpRequest) {
                    ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
                    attributes.put(IP_ADDRESS, servletRequest.getRemoteAddress());
                }
                return true;
            }

            @Override
            public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {

            }
        };
    }

    private DefaultHandshakeHandler defaultHandshakeHandler() {
        return new DefaultHandshakeHandler() {
            @Override
            protected Principal determineUser(ServerHttpRequest request, WebSocketHandler wsHandler, Map<String, Object> attributes) {
                Principal principal = request.getPrincipal();
                if (principal == null) {
                    Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
                    authorities.add(new SimpleGrantedAuthority(AuthoritiesConstants.ANONYMOUS));
                    principal = new AnonymousAuthenticationToken("WebsocketConfiguration", "anonymous", authorities);
                }
                return principal;
            }
        };
    }
    @Override
   	public void configureClientInboundChannel(ChannelRegistration registration) {
   		registration.interceptors(new ChannelInterceptor() {
   			@Override
   			public Message<?> preSend(Message<?> message, MessageChannel channel) {
   				
   				
   				StompHeaderAccessor accessor =
   						MessageHeaderAccessor.getAccessor(message, StompHeaderAccessor.class);
   				
   				
   				if (StompCommand.CONNECT.equals(accessor.getCommand())) {
   					
   					System.out.println(" NAtive Header**"+accessor.getFirstNativeHeader("login"));
   					String login=accessor.getFirstNativeHeader("login");
   					Optional<User> optionalUser=userRepository.findOneWithAuthoritiesByLogin(login);
   					if(optionalUser.isPresent())
   					{
   						Set<Authority> userAuthorities=optionalUser.get().getAuthorities();
   						System.out.println("Authrorities++++"+userAuthorities);
   						Set<GrantedAuthority> grantedAuthorities = userAuthorities.stream()
   						            .map(Authority::getName)
   						            .map(SimpleGrantedAuthority::new)
   						            .collect(Collectors.toSet());
   						System.out.println("Granted Authrorities++++"+grantedAuthorities);
   						UserDetails userDetails =
   				            new org.springframework.security.core.userdetails.User(optionalUser.get().getLogin(),
   				            "N/A",grantedAuthorities );
   				        // update Spring Security Authorities to match groups claim from IdP
   				        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
   				            userDetails, "N/A", grantedAuthorities);
   				        accessor.setUser(token);
   				        System.out.println("After Seting User :::"+SecurityUtils.getCurrentUserLogin() );
   					
   					}
   				}
   				return message;
   			}
   		});
   	}
}
