package com.example;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableSwagger2Doc//生成swagger文档
@EnableEurekaClient
@SpringBootApplication
public class AppPay {

    public static void main(String[] args) {
        SpringApplication.run(AppPay.class,args);
    }
}
