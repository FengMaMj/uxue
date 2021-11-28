package com.offcn.content.dao;

import com.offcn.content.entity.BannerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-横幅广告表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-26 14:13:20
 */
@Mapper
public interface BannerDao extends BaseMapper<BannerEntity> {
	
}
