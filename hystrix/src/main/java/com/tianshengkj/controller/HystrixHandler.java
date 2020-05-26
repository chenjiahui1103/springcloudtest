package com.tianshengkj.controller;

import com.tianshengkj.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/getPort")
    public String getPort(){
        return feignProviderClient.getPort();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }

}
