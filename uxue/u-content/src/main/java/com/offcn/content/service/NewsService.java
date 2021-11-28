package com.offcn.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.offcn.common.utils.PageUtils;
import com.offcn.content.entity.NewsEntity;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-26 14:13:20
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

