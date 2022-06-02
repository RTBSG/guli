package com.bsg.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsg.common.utils.PageUtils;
import com.bsg.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 17:01:19
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

