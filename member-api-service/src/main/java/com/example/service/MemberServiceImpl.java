package com.example.service;

import com.example.BaseApiService;
import com.example.MemberService;
import com.example.ResponseBase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MemberServiceImpl extends BaseApiService implements MemberService {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getMember")
    @Override
    public String getMember() {
        return "订单服务调用会员服务,serverport :"+serverPort;
    }

    @RequestMapping("/getUserInfo")
    @Override
    public ResponseBase getUserInfo() {
        try {
            //订单服务调用会员服务产生1.5s延时
            Thread.sleep(5500);
            System.out.println("1.5s后访问成功");
        }catch (Exception e){

        }
        return setResultSuccess("订单服务接口调用会员服务接口成功...");
    }

    @Value("${membername}")
    private String name;

    @RequestMapping("/getName")
    public String getName(){
        return "会员服务读取configServer配置，name："+name;
    }
}
