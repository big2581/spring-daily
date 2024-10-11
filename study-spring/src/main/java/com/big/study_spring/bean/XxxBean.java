package com.big.study_spring.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * Bean的生命周期
 * 1. bean对象的实例化
 * 1.1 lazy-init 是否实例化
 * 2. bean对象的初始化
 * 2.1 属性赋值
 * 2.2 执行aware接口
 * 2.3 BeanPostProcessor before 方法
 * 2.4 执行initializingBean  afterPropertiesSet 方法
 * 2.5 自定义初始化方法 init-method
 * 2.6 BeanPostProcessor after 方法
 * 3.Bean对象的完成
 *
 * @author Yin
 * @date 2024-10-08 13:25
 */
public class XxxBean implements InitializingBean {

    public XxxBean() {
        System.out.println("XxxBean类 实例化方法开始....");
    }

    public void init() {
        System.out.println("XxxBean类 初始化方法...");
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String name;

    @Override
    public void afterPropertiesSet() throws Exception {
        //
        System.out.println("属性赋值之后: afterPropertiesSet。。。。");
    }
}
