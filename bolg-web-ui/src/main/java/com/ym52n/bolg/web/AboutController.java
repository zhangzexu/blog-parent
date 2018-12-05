package com.ym52n.bolg.web;

import com.ym52n.bolg.feign.AboutFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;


/**
 * @Title
 * @ClassName AboutController
 * @Desription
 * @Author yangxiaoxiao
 * @Date 2018/12/4 21:06
 * @Version V1.0
 */
@Controller
public class AboutController {
    @Autowired
    private AboutFeignClient aboutFeignClient;

    @RequestMapping({"/about","/"})
    public String index(HttpServletRequest request){
        System.out.println(aboutFeignClient.getAboutInfo());
        return "about";
    }


}
