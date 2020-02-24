package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @RequestMapping("/getPay")
    public String getPay(){
        return "这是一个支付项目";
    }
}
