package com.bsg.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsg.common.utils.PageUtils;
import com.bsg.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 17:03:12
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

