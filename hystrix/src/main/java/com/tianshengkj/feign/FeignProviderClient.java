package com.tianshengkj.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "providertest",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/test/getPort2")
    public String index();

    @GetMapping("/test/getPort")
    public String getPort();
}
