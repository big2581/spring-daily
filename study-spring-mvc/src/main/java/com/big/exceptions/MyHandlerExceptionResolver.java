package com.big.exceptions;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * spring mvc 处理的异常的机制
 *
 * @author Yin
 * @date 2024-10-16 14:09
 */

public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("/index.jsp");

        String name = handler.getClass().getName();
        try {
            response.getWriter().write("给你abc异常:" + name + ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
