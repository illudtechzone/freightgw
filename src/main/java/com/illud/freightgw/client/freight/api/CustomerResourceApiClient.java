package com.illud.freightgw.client.freight.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.freightgw.client.freight.ClientConfiguration;

@FeignClient(name="${freight.name:freight}", url="${freight.url:35.232.29.128:8085/freight}", configuration = ClientConfiguration.class)
public interface CustomerResourceApiClient extends CustomerResourceApi {
}