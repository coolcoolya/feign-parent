package com.example.service;

import com.example.OrderService;
import com.example.ResponseBase;
import com.example.feign.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceImpl implements OrderService {

    @Autowired
    private MemberFeign memberFeign;

    @RequestMapping("/orderToMember")
    @Override
    public String orderToMember(String name) {
        return memberFeign.getMember();
    }

    @RequestMapping("/orderToMemberUserInfo")
    @Override
    public ResponseBase orderToMemberUserInfo() {
        return memberFeign.getUserInfo();
    }
}
