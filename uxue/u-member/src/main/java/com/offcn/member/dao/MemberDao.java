package com.offcn.member.dao;

import com.offcn.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-26 14:54:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
