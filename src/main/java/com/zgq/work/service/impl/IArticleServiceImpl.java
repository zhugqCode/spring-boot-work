package com.zgq.work.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zgq.work.dao.ArticleDao;
import com.zgq.work.pojo.ArticleDo;
import com.zgq.work.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IArticleServiceImpl implements IArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public PageInfo<ArticleDo> getAllArticle(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<ArticleDo> article = articleDao.getAllArticle();
        return new PageInfo<ArticleDo>(article);
    }
}
