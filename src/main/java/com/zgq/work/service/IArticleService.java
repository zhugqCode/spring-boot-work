package com.zgq.work.service;

import com.github.pagehelper.PageInfo;
import com.zgq.work.pojo.ArticleDo;


public interface IArticleService {

    PageInfo<ArticleDo> getAllArticle(Integer pageNo, Integer pageSize);
}
