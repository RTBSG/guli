package com.bsg.product.dao;

import com.bsg.product.entity.SkuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku信息
 * 
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 15:00:11
 */
@Mapper
public interface SkuInfoDao extends BaseMapper<SkuInfoEntity> {
	
}
