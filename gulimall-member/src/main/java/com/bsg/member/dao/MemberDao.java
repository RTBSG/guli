package com.bsg.member.dao;

import com.bsg.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 16:53:23
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
