package com.xue.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xue.common.utils.PageUtils;
import com.xue.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author snowcastle
 * @email snowcastle@qq.com
 * @date 2023-06-20 17:34:44
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

