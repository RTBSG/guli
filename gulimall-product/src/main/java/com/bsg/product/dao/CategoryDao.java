package com.bsg.product.dao;

import com.bsg.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 15:00:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
