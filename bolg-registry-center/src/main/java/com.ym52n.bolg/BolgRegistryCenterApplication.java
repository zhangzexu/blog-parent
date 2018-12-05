package com.ym52n.bolg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @Title
 * @ClassName BolgRegistryCenterApplication
 * @Desription
 * @Author yangxiaoxiao
 * @Date 2018/12/4 21:02
 * @Version V1.0
 */
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class BolgRegistryCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(BolgRegistryCenterApplication.class, args);
    }
}
