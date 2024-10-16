package com.big.config;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * 让web.xml 由配置文件 转换 加载核心配置类 替代 XmlWebApplicationContext容器
 *
 * @author Yin
 * @date 2024-10-16 10:16
 */
public class MyAnnotationWebApplicationContext extends AnnotationConfigWebApplicationContext {
    public MyAnnotationWebApplicationContext() {
        this.register(SpringMvcConfig.class);
    }
}
