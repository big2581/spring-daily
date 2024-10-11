package com.big.study_spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * BeanDefinitionRegistryPostProcessor 是 BeanFactoryPostProcessor 的子接口 能
 * 更好的注册BeanDefinition
 *
 * @author Yin
 * @date 2024-10-08 11:50
 */
public class MyRegisterBeanFactoryProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("子接口开始注册BeanDefinition。。。");
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClassName("com.big.study_spring.bean.Person");
        registry.registerBeanDefinition("person2", rootBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanDefinitionRegistryPostProcessor 是 BeanFactoryPostProcessor 的子接口");
    }
}
