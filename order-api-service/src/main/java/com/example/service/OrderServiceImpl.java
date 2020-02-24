package com.example.service;

import com.example.BaseApiService;
import com.example.OrderService;
import com.example.ResponseBase;
import com.example.feign.MemberFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceImpl extends BaseApiService implements OrderService {

    @Autowired
    private MemberFeign memberFeign;

    @RequestMapping("/orderToMember")
    @Override
    public String orderToMember(String name) {
        return memberFeign.getMember();
    }


    //没有解决服务雪崩效应
    @RequestMapping("/orderToMemberUserInfo")
    @Override
    public ResponseBase orderToMemberUserInfo() {
        return memberFeign.getUserInfo();
    }


    //解决服务雪崩效应
    //@HystrixCommand注解默认开启线程池隔离方式，服务降级,服务熔断。
    //fallbackMethod方法作用，服务降级执行
    @HystrixCommand(fallbackMethod = "orderToMemberUserInfoHystrixFallback")
    @RequestMapping("/orderToMemberUserInfoHystrix")
    @Override
    public ResponseBase orderToMemberUserInfoHystrix() {
        System.out.println("orderToMemberUserInfoHystrix线程池名称："+Thread.currentThread().getName());
        return memberFeign.getUserInfo();
    }

    public ResponseBase orderToMemberUserInfoHystrixFallback(){
        return setResultSuccess("返回一个友好提示：服务降级，服务器忙，请稍后重试!");
    }

    //Hystrix，服务降级方法，第二种写法，使用类的方式
    @RequestMapping("/orderToMemberUserInfoHystrixDemo2")
    public ResponseBase orderToMemberUserInfoHystrixDemo2(){
        System.out.println("orderToMemberUserInfoHystrix线程池名称："+Thread.currentThread().getName());
        return memberFeign.getUserInfo();
    }


    @RequestMapping("/orderInfo")
    @Override
    public ResponseBase orderInfo() {
        System.out.println("orderInfo线程池名称："+Thread.currentThread().getName());
        return setResultSuccess();
    }
}
