package com.ym52n.bolg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title
 * @ClassName MoodController
 * @Desription
 * @Author yangxiaoxiao
 * @Date 2018/12/4 21:27
 * @Version V1.0
 */
@Controller
public class MoodController {
    @RequestMapping("/mood")
    public String index(){
        return "mood";
    }

    @RequestMapping("/mood1")
    public String mood1(){
        return "mood1";
    }

    @RequestMapping("/mood2")
    public String mood2(){
        return "mood2";
    }

    @RequestMapping("/mood-detail")
    public String moodDetail(){
        return "mood-detail";
    }
}
