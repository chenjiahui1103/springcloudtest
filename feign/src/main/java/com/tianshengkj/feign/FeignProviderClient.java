package com.tianshengkj.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "providertest")
public interface FeignProviderClient {

    @GetMapping("/test/getPort")
    public String getPort();
}
