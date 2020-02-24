package com.example.fallback;

import com.example.BaseApiService;
import com.example.ResponseBase;
import com.example.feign.MemberFeign;
import org.springframework.stereotype.Component;

@Component
public class MemberFeignFallback extends BaseApiService implements MemberFeign {
    //写服务降级友好提示

    @Override
    public String getMember() {
        return null;
    }

    @Override
    public ResponseBase getUserInfo() {
        return setResultError("服务器忙，请稍后重试");
    }
}
