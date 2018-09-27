package com.example.consulproducer_server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulproducerServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulproducerServer2Application.class, args);
    }
}
