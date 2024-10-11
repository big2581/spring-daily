package com.big.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor处理器
 *
 * @author Yin
 * @date 2024-10-10 15:10
 */
public class XiaoqBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("注册了一个BeanPostProcessor");
        return bean;
    }
}
