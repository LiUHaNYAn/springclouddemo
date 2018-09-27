package com.example.consumer_demo2hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerDemo2hystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDemo2hystrixApplication.class, args);
    }
}
