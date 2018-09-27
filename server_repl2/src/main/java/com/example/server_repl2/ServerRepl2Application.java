package com.example.server_repl2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerRepl2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerRepl2Application.class, args);
    }
}
