package com.xue.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xue.common.utils.PageUtils;
import com.xue.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author snowcastle
 * @email snowcastle@qq.com
 * @date 2023-06-22 19:42:10
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

