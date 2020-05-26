package com.zgq.work.dao;

import com.zgq.work.pojo.ArticleDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleDao {

    @Select("select * from t_article")
    List<ArticleDo> getAllArticle();
}
