package com.example.configserver_repl1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigserverRepl1Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigserverRepl1Application.class, args);
    }
}
