package com.xue.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xue.common.utils.PageUtils;
import com.xue.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author snowcastle
 * @email snowcastle@qq.com
 * @date 2023-06-22 19:34:07
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

