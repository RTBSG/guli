package com.bsg.member.feign;

import com.bsg.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 远程调用先去nacos中找gulimall-coupon这台服务然后根据restful地址调用方法
 * 调用方需要开启调用接口 @EnableFeignClients
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {



    @RequestMapping("/coupon/coupon/member/list")
    R membercoupons();





}
