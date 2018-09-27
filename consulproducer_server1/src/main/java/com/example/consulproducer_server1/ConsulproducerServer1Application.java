package com.example.consulproducer_server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulproducerServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulproducerServer1Application.class, args);
    }
}
