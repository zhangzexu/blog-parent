package com.ym52n.bolg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title
 * @ClassName ArticleController
 * @Desription
 * @Author yangxiaoxiao
 * @Date 2018/12/4 21:27
 * @Version V1.0
 */
@Controller
public class ArticleController {
    @RequestMapping("/article")
    public String index(){
        return "article";
    }

    @RequestMapping("/article1")
    public String article1(){
        return "article1";
    }
    @RequestMapping("/article-detail")
    public String articleDetail(){
        return "article-detail";
    }
}
