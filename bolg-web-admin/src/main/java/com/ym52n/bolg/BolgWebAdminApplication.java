package com.ym52n.bolg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Title
 * @ClassName BolgWebAdminApplication
 * @Desription
 * @Author yangxiaoxiao
 * @Date 2018/12/5 15:54
 * @Version V1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class BolgWebAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BolgWebAdminApplication.class,args);
    }
}
