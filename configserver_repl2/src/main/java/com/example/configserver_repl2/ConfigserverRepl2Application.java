package com.example.configserver_repl2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigserverRepl2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigserverRepl2Application.class, args);
    }
}
