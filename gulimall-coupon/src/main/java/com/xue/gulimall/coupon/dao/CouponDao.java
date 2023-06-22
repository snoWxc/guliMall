package com.xue.gulimall.coupon.dao;

import com.xue.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author snowcastle
 * @email snowcastle@qq.com
 * @date 2023-06-22 20:10:48
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
