package com.example.server_repl1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerRepl1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerRepl1Application.class, args);
    }
}
