package com.example.configclient_demo2repl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigclientDemo2replApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigclientDemo2replApplication.class, args);
    }
}
