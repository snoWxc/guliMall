package com.xue.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xue.common.utils.PageUtils;
import com.xue.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author snowcastle
 * @email snowcastle@qq.com
 * @date 2023-06-22 19:42:10
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

