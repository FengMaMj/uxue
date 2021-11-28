package com.offcn.question.dao;

import com.offcn.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-26 14:58:30
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
