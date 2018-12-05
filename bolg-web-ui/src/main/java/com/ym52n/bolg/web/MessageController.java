package com.ym52n.bolg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Title
 * @ClassName MessageController
 * @Desription
 * @Author yangxiaoxiao
 * @Date 2018/12/4 21:29
 * @Version V1.0
 */
@Controller
public class MessageController {
    @RequestMapping("/message")
    public String index(HttpServletRequest request){
        return "message";
    }

    @RequestMapping("/messageSend")
    public String messageSend(HttpServletRequest request){
        System.out.println(request.getParameter("message"));
        return "message";
    }
}
