package com.big.context;

import com.big.SpringBeanConfig;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * 加载注解
 *
 * @author Yin
 * @date 2024-10-15 11:26
 */
public class MyAnnotationApplicationContext extends AnnotationConfigWebApplicationContext {

    public MyAnnotationApplicationContext(){
        super();
        this.register(SpringBeanConfig.class);
    }
}
