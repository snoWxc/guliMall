package com.xue.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xue.common.utils.PageUtils;
import com.xue.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author snowcastle
 * @email snowcastle@qq.com
 * @date 2023-06-22 19:34:07
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

