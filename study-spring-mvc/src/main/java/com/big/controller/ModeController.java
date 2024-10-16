package com.big.controller;

import com.big.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 转发、重定向、视图对象
 *
 * @author Yin
 * @date 2024-10-15 17:11
 */
@RequestMapping("mode")
@ResponseBody
//@RestController
public class ModeController {

    @GetMapping("forward")
    public String forward() {
        //默认就是转发
        return "forward:/index.jsp";
    }

    @GetMapping("redirect")
    public String redirect() {
        //重定向
        return "redirect:/index.jsp";
    }

    @GetMapping("modeAndView")
    public ModelAndView modeAndView() {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setAge(19);
        user.setName("xiaoq");
        modelAndView.setViewName("index.jsp");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @GetMapping("getStr")
    @ResponseBody
    //告诉视图解析器这是一个字符串 不是视图名
    public String getStr() {
        //
      return "hello str";
    }
}
