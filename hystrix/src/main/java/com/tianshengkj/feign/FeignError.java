package com.tianshengkj.feign;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FeignError implements FeignProviderClient{

    @Override
    public String index() {
        return "维护中";
    }

    @Override
    public String getPort() {
        return "123";
    }
}
