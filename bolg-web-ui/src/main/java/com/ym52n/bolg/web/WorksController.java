package com.ym52n.bolg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title
 * @ClassName WorksController
 * @Desription
 * @Author yangxiaoxiao
 * @Date 2018/12/4 21:28
 * @Version V1.0
 */
@Controller
public class WorksController {
    @RequestMapping("/works")
    public String index(){
        return "works";
    }
}
