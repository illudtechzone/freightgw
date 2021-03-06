package com.illud.freightgw.client.freight.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.freightgw.client.freight.ClientConfiguration;

@FeignClient(name="${freight.name:freight}", url="${freight.url:35.193.1.70:8085/}", configuration = ClientConfiguration.class)
public interface UserResourceApiClient extends UserResourceApi {
}