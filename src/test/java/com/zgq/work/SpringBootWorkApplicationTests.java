package com.zgq.work;

import com.zgq.work.pojo.ArticleDo;
import com.zgq.work.service.IArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootWorkApplicationTests {

    @Autowired
    private IArticleService iArticleService;
}
