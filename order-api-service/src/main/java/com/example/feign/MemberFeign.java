package com.example.feign;

import com.example.MemberService;
import com.example.fallback.MemberFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "app-feign-member",fallback = MemberFeignFallback.class)
public interface MemberFeign extends MemberService {
}
