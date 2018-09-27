package com.example.consulconsumer_client1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @Autowired
    private LoadBalancerClient balancerClient;
    @Autowired
    private DiscoveryClient discoveryClient;
    @RequestMapping("/services")
    public  Object service(){
        return discoveryClient.getInstances("serviceProvider");
    }
    @RequestMapping("/discover")
    public Object discover(){
        return  balancerClient.choose("serviceProvider").getUri().toString();
    }
}
