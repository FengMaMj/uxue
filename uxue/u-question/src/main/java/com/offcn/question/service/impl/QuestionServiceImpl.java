package com.offcn.question.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.offcn.common.utils.PageUtils;
import com.offcn.common.utils.Query;
import com.offcn.question.dao.QuestionDao;
import com.offcn.question.entity.QuestionEntity;
import com.offcn.question.service.QuestionService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Map;


@Service("questionService")
public class QuestionServiceImpl extends ServiceImpl<QuestionDao, QuestionEntity> implements QuestionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //1、获取查询关键字
        String key= (String) params.get("key");
        //2、创建查询条件对象
        QueryWrapper<QuestionEntity> queryWrapper = new QueryWrapper<>();
        //3、设置查询条件
        if(!StringUtils.isEmpty(key)){
            queryWrapper.eq("id",key).or().like("title",key);

        }
        IPage<QuestionEntity> page = this.page(
                new Query<QuestionEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

}