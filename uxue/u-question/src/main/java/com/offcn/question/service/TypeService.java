package com.offcn.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.offcn.common.utils.PageUtils;
import com.offcn.question.entity.TypeEntity;

import java.util.List;
import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-26 14:58:30
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);


    //获取全部分类
    List<TypeEntity> findAll();
}

