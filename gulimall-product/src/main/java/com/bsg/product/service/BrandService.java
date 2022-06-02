package com.bsg.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsg.common.utils.PageUtils;
import com.bsg.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 15:00:11
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

