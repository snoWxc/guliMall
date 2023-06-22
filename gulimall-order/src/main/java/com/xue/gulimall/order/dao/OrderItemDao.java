package com.xue.gulimall.order.dao;

import com.xue.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author snowcastle
 * @email snowcastle@qq.com
 * @date 2023-06-22 19:42:10
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
