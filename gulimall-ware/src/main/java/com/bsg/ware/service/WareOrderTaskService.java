package com.bsg.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsg.common.utils.PageUtils;
import com.bsg.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 17:03:13
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

