package com.example.consumer_demo1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "producer")
@Service
public interface HelloRemote {
    @RequestMapping("/hello")
    String hello(@RequestParam("name") String name);
}
