package com.example.configclient_demo2repl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Value("${neo.hello}")
    private  String val;
    @RequestMapping("/")
    public  String index(){
        return  val;
    }
}
