package com.ym52n.bolg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title
 * @ClassName AboutServiceController
 * @Desription
 * @Author yangxiaoxiao
 * @Date 2018/12/5 16:11
 * @Version V1.0
 */
@RestController
public class AboutServiceController extends BaseController {

    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String getAboutInfo(){

        return "test";
    }
}
