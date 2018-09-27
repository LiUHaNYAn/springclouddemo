package com.example.producer_demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProducerDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProducerDemo2Application.class, args);
    }
}
