package com.illud.freightgw.client.freightgw.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.freightgw.client.freightgw.ClientConfiguration;

@FeignClient(name="${freightgw.name:freightgw}", url="${freightgw.url:35.232.29.128:8085/freight}", configuration = ClientConfiguration.class)
public interface UserResourceApiClient extends UserResourceApi {
}