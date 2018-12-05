package com.ym52n.bolg.web;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Title
 * @ClassName LoginController
 * @Desription
 * @Author yangxiaoxiao
 * @Date 2018/12/5 17:22
 * @Version V1.0
 */
@RestController
public class LoginController extends BaseController {
    @GetMapping("/")
    public User findById(){
        LOGGER.info("--------");
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principal instanceof UserDetails){
            UserDetails userDetails = (UserDetails) principal;
            Collection<? extends GrantedAuthority> collection = userDetails.getAuthorities();
            for (GrantedAuthority c :collection){
                System.out.println(userDetails.getUsername()+"---"+c.getAuthority());
            }
        }else {
            return null;
        }
        return null;
    }
}
