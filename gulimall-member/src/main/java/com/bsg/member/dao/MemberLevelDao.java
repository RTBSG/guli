package com.bsg.member.dao;

import com.bsg.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 16:53:23
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
