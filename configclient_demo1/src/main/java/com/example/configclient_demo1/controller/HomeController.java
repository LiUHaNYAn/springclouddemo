package com.example.configclient_demo1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {
    @Value("${neo.hello}")
    private  String val;
    @RequestMapping("/")
    public  String index(){
        return  val;
    }
}
