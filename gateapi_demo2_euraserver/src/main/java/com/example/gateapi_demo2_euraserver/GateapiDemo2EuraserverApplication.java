package com.example.gateapi_demo2_euraserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class GateapiDemo2EuraserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateapiDemo2EuraserverApplication.class, args);
    }
}
