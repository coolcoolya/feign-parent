package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer //开启config server服务器端
@EnableEurekaClient
@SpringBootApplication
public class AppConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigServer.class,args);
    }
}
