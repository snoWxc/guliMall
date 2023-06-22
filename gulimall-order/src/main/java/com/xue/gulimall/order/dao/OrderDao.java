package com.xue.gulimall.order.dao;

import com.xue.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author snowcastle
 * @email snowcastle@qq.com
 * @date 2023-06-22 19:42:10
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
