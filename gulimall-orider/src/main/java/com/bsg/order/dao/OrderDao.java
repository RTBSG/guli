package com.bsg.order.dao;

import com.bsg.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 17:01:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
