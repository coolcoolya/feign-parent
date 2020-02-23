package com.example;

import org.springframework.web.bind.annotation.RequestMapping;

public interface OrderService {

    @RequestMapping("/orderToMember")
    public String orderToMember(String name);
}
