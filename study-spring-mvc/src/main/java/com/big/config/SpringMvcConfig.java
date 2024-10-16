package com.big.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * mvc 的配置类 （消除Spring-mvc.xml配置文件）
 *
 * @author Yin
 * @date 2024-10-16 10:00
 */
@Configuration
@ComponentScan({"com.big.controller", "com.big.config"})
@EnableWebMvc
public class SpringMvcConfig {

    /**
     * @return org.springframework.web.multipart.commons.CommonsMultipartResolver
     * @apiNote 文件上传视图解析器
     * @author Yin
     * @date 2024/10/16 14:14
     */
    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setDefaultEncoding("UTF-8");
        return commonsMultipartResolver;
    }
    /**
     * @apiNote 只能跳转视图  对前后端分离的开发不友好
     * @author Yin
     * @date 2024/10/16 14:27
     */
//    @Bean
//    public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
//        SimpleMappingExceptionResolver simpleMappingExceptionResolver = new SimpleMappingExceptionResolver();
//        //默认的异常视图
//        simpleMappingExceptionResolver.setDefaultErrorView("/index.jsp");
//        //指定异常类的视图
//        Properties properties = new Properties();
//        //key 权限定类名  value 视图
//        properties.setProperty("java.lang.RuntimeException", "/index.jsp");
//        properties.setProperty("java.io.FileNotFoundException", "/index.jsp");
//        simpleMappingExceptionResolver.setExceptionMappings(properties);
//
//        return simpleMappingExceptionResolver;
//    }


}
