package com.bsg.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsg.common.utils.PageUtils;
import com.bsg.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 17:01:19
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

