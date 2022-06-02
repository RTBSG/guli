package com.bsg.product.dao;

import com.bsg.product.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 15:00:11
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
