package com.big.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * TODO
 *
 * @author Yin
 * @date 2024-10-17 16:25
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    public MyApplicationContextInitializer(ApplicationContext parent) {

    }

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("ApplicationContextInitializer initialize。。。 开始执行");
    }
}
