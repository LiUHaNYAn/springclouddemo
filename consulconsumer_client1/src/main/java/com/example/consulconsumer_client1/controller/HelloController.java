package com.example.consulconsumer_client1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @RequestMapping("/hello")
    public String hello(){
       ServiceInstance serviceInstanceChooser= loadBalancerClient.choose("serviceProvider");
       String calltemplate=new RestTemplate().getForObject(serviceInstanceChooser.getUri().toString()+"/hello",String.class);
       return  calltemplate;
    }
}
