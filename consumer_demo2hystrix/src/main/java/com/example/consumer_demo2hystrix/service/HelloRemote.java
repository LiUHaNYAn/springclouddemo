package com.example.consumer_demo2hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "producer",fallback =HelloRemoteFallback.class )
@Service
public interface HelloRemote {
    @RequestMapping("/hello")
    String hello(@RequestParam(name="name") String name);
}
