package com.example;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableSwagger2Doc
@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class AppOrder {
    public static void main(String[] args) {
        SpringApplication.run(AppOrder.class,args);
    }
}
