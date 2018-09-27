package com.example.consumer_demo1.controller;

import com.example.consumer_demo1.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloRemote helloRemote;
    @RequestMapping("/hello")
    public String Hello(String name){
        return helloRemote.hello(name);
    }
}
