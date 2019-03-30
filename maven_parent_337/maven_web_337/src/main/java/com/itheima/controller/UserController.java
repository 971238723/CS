package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    /*
     * 根据id查询
     */
    @RequestMapping("/findById")
    public ModelAndView findById(Integer id){
        //根据id查询用户
        User user = userService.findById(id);
        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        //添加数据
        modelAndView.addObject("user",user);
        //指定页面
        modelAndView.setViewName("show");

        return  modelAndView;
    }
}
