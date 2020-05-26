package com.tianshengkj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getCount")
    public int getCount(){
        return restTemplate.getForObject("http://localhost:8010/test/getCount",Integer.class);
    }

}
