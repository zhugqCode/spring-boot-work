package com.zgq.work.controller;

import com.zgq.work.service.IArticleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/article/")
public class ArticleController {

    @Autowired
    private IArticleService iArticleService;

    @RequestMapping("getAllArticle.do")
    public String getAllArticle(Model model, @RequestParam(value = "pageNo",defaultValue = "0") Integer pageNo,
                                @RequestParam(value = "pageSize",defaultValue = "1") Integer pageSize){
        model.addAttribute("page", iArticleService.getAllArticle(pageNo,pageSize));
        return "index";
    }
}
