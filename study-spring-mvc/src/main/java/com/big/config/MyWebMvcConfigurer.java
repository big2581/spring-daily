package com.big.config;

import com.big.exceptions.MyHandlerExceptionResolver;
import com.big.interceptors.MyHandlerInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * webmvc 实现具体的功能
 *
 * @author Yin
 * @date 2024-10-16 10:04
 */
@Component
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    /**
     * @param configurer
     * @apiNote 开启默认servlet处理器  处理@RequestMapping
     * @author Yin
     * @date 2024/10/16 10:05
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

        configurer.enable();
    }

    /**
     * @param registry 拦截器注册
     * @apiNote 添加拦截器
     * @author Yin
     * @date 2024/10/16 10:06
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHandlerInterceptor())
                .addPathPatterns("/**");
    }

    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        resolvers.add(new MyHandlerExceptionResolver());
    }
}
