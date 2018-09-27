package com.example.consumer_demo2hystrix.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteFallback implements HelloRemote {
    @Override
    public String hello(@RequestParam(name = "name") String name) {
        return "hi ,"+name+",this is msg from local";
    }
}
