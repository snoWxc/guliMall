package com.xue.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xue.common.utils.PageUtils;
import com.xue.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author snowcastle
 * @email snowcastle@qq.com
 * @date 2023-06-22 20:10:48
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

