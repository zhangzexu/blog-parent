package com.ym52n.bolg.config;

import com.netflix.ribbon.proxy.annotation.Http;
import com.ym52n.bolg.beans.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @Title
 * @ClassName WebSecurityConfig
 * @Desription
 * @Author yangxiaoxiao
 * @Date 2018/12/5 17:03
 * @Version V1.0
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println(http);
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(this.userDetailsService).passwordEncoder(this.passwordEncoder());
    }
}
@Component
class CustomUserDetailsService implements UserDetailsService{
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if("admin".equals(username)){
            return new SecurityUser("admin","admin","user-role");
        }else {
            return null;
        }
    }
}
