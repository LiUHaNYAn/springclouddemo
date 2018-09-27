package com.example.consumer_demo2hystrix.controller;

import com.example.consumer_demo2hystrix.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloRemote helloRemote;
    @RequestMapping("/hello")
    public  String hello(String name){
        return helloRemote.hello(name);
    }
}
