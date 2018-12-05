package com.ym52n.bolg.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Title
 * @ClassName AboutFeignClient
 * @Desription
 * @Author yangxiaoxiao
 * @Date 2018/12/5 16:36
 * @Version V1.0
 */
@FeignClient(name="bolg-web-admin")
public interface AboutFeignClient {
    @RequestMapping(value = "bolg-web-admin/about", method = RequestMethod.GET)
    public String getAboutInfo();
}
