package com.big.study_spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * 后置处理器 只在BeanDefinition期间
 *
 * @author Yin
 * @date 2024-10-08 11:24
 */
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        org.springframework.beans.factory.support.DefaultListableBeanFactory
        System.out.println("BeanFactoryPostProcessor 开始处理BeanDefinition....");
        System.out.println(beanFactory);
        //向下转型
        DefaultListableBeanFactory factory = (DefaultListableBeanFactory) beanFactory;

        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClassName("com.big.study_spring.bean.Person");

        factory.registerBeanDefinition("person", rootBeanDefinition);

        BeanDefinition person = beanFactory.getBeanDefinition("person");
        person.setInitMethodName("init");
    }
}
