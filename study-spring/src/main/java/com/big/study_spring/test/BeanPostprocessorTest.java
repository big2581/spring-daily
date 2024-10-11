package com.big.study_spring.test;

import com.big.study_spring.bean.AbcBean;
import com.big.study_spring.bean.XxxBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * BeanPostprocessor 相关调试
 *
 * @author Yin
 * @date 2024-10-08 13:22
 */
public class BeanPostprocessorTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanpostprocessor.xml");
    }
}
