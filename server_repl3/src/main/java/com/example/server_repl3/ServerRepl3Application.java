package com.example.server_repl3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerRepl3Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerRepl3Application.class, args);
    }
}
