package com.yyzc.hy.shiroserver.controller;

import com.yyzc.hy.shiroserver.entity.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: songyalong
 * @Description: 登录
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
@RestController
public class LoginController {

    @PostMapping(value = "/login")
    public ModelAndView login(UserInfo userInfo){
        ModelAndView modelAndView = new ModelAndView("/login");

        return modelAndView;
    }

    @GetMapping(value = "/auth/login")
    public ModelAndView authLogin(HttpServletRequest request){
        request.getParameter()
        ModelAndView modelAndView = new ModelAndView();
    }
}
