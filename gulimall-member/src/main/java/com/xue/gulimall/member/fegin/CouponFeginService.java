package com.xue.gulimall.member.fegin;

import com.xue.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeginService {
    @RequestMapping("/coupon/coupon/memeber/list")
    public R membercoupons();
}
