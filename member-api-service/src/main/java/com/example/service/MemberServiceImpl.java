package com.example.service;

import com.example.BaseApiService;
import com.example.MemberService;
import com.example.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl extends BaseApiService implements MemberService {

    @RequestMapping("/getMember")
    @Override
    public String getMember() {
        return "订单服务调用会员服务";
    }

    @RequestMapping("/getUserInfo")
    @Override
    public ResponseBase getUserInfo() {
        try {
            //订单服务调用会员服务产生1.5s延时
            Thread.sleep(1500);
        }catch (Exception e){

        }
        return setResultSuccess("订单服务接口调用会员服务接口成功...");
    }
}
