package com.bsg.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsg.common.utils.PageUtils;
import com.bsg.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 17:01:19
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

