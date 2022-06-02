package com.bsg.coupon.dao;

import com.bsg.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 16:02:16
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
