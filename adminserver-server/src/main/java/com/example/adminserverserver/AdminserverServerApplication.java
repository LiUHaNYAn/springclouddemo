package com.example.adminserverserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminserverServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminserverServerApplication.class, args);
    }
}
