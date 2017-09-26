package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lzh on 2017/9/26.
 */
@Controller
public class IndexPage {

//    @RequestMapping("/")
//    public ModelAndView indexPage(){
//        return new ModelAndView("../index");
//    }

    @RequestMapping("/index")
    public ModelAndView indexPage2(){
        return new ModelAndView("../index");
    }
}
