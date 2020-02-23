package com.example.service;

import com.example.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {

    @RequestMapping("/getMember")
    @Override
    public String getMember() {
        return "订单服务调用会员服务";
    }
}
