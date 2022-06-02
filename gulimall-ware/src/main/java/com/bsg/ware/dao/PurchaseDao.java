package com.bsg.ware.dao;

import com.bsg.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 17:03:12
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
