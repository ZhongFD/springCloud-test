package com.example.eurekad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaDApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDApplication.class, args);
    }

}
