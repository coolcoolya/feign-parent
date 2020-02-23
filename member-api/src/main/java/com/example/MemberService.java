package com.example;

import org.springframework.web.bind.annotation.RequestMapping;

public interface MemberService {

    @RequestMapping("/getMember")
    public String getMember();

    @RequestMapping("/getUserInfo")
    public ResponseBase getUserInfo();
}
