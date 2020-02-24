package com.example.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("支付服务接口")
@RestController
public class PayController {

    @RequestMapping("/getPay")
    public String getPay(){
        return "这是一个支付项目";
    }
}
