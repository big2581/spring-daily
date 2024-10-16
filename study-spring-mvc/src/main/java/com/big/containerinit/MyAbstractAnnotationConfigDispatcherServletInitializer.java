package com.big.containerinit;

import com.big.config.SpringConfig;
import com.big.config.SpringMvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * spring提供消除web.xml 配置类
 *
 *
 * @author Yin
 * @date 2024-10-16 11:12
 */
public class MyAbstractAnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    //配置spring的核心配置类
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    //配置spring-mvc核心配置类
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    //servlet 前端控制器映射路径
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
