package com.study.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by lzh on 2017/9/27.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String doLogin(){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken();
        token.setUsername("tusername");
        token.setPassword("tpassword".toCharArray());
        subject.login(token);
        return "../../index";
    }
}
