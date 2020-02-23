package com.example.feign;

import com.example.MemberService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("app-feign-member")
public interface MemberFeign extends MemberService {
}
