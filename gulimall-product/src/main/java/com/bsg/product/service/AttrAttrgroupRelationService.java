package com.bsg.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsg.common.utils.PageUtils;
import com.bsg.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 15:00:11
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

