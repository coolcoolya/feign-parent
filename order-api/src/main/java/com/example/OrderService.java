package com.example;

import org.springframework.web.bind.annotation.RequestMapping;

public interface OrderService {

    @RequestMapping("/orderToMember")
    public String orderToMember(String name);

    @RequestMapping("/orderToMemberUserInfo")
    public ResponseBase orderToMemberUserInfo();

    @RequestMapping("/orderToMemberUserInfoHystrix")
    public ResponseBase orderToMemberUserInfoHystrix();

    @RequestMapping("/orderInfo")
    public ResponseBase orderInfo();
}
