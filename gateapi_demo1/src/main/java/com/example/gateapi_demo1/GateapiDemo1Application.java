package com.example.gateapi_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulProxy
public class GateapiDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(GateapiDemo1Application.class, args);
    }
}
