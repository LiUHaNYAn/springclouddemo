package com.example.server_single;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerSingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerSingleApplication.class, args);
    }
}
