package com.bsg.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsg.common.utils.PageUtils;
import com.bsg.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author bsg
 * @email sunlightcs@gmail.com
 * @date 2022-06-02 16:53:23
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

