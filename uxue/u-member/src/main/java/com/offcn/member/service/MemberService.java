package com.offcn.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.offcn.common.utils.PageUtils;
import com.offcn.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-26 14:54:02
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

