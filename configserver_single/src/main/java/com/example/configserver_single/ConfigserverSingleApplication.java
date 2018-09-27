package com.example.configserver_single;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverSingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigserverSingleApplication.class, args);
    }
}
