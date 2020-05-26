package com.tianshengkj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon")
public class ApiHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getPort")
    public String getPort(){
        return restTemplate.getForObject("http://providertest/test/getPort",String.class);
    }
}
