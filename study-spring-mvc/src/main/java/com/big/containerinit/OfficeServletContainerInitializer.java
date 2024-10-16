package com.big.containerinit;

import com.big.service.UserService;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * 官方提供 一个接口去消除 web.xml件
 *
 * @author Yin
 * @date 2024-10-16 10:40
 */
@HandlesTypes(UserService.class)//该注解会导入 改接口的实现类   //当前接口和spring没有关系
public class OfficeServletContainerInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("自定义的ServletContainerInitializer running......");
    }
}
