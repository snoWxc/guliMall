package com.xue.gulimall.member.dao;

import com.xue.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author snowcastle
 * @email snowcastle@qq.com
 * @date 2023-06-22 19:34:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
