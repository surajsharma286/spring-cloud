package com.suraj.microservices.limitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class LimitMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimitMicroserviceApplication.class, args);
    }

}
