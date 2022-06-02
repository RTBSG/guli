package com.bsg.ware.dao;

import com.bsg.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 17:03:12
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
