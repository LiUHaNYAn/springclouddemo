package com.example.configclient_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigclientDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigclientDemo1Application.class, args);
    }
}
