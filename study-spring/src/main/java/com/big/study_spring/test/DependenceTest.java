package com.big.study_spring.test;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 循环依赖 三级缓存的解决方案
 *
 * @author Yin
 * @date 2024-10-08 15:23
 */
public class DependenceTest {
    //一级缓存 存储完整的Bean对象 完成了实例化、初始化的过程 一级缓存
    private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>(256);

    //半成品单例池bean  缓存半成品对象 并该对象已经被其他对象引用  二级缓存
    private final Map<String, Object> earlySingletonObjects = new ConcurrentHashMap<>(16);

    //单例Bean的工厂池 缓存半成品对象，对象未被引用，实际使用才会通过工厂创建bean  三级缓存
    private final Map<String, ObjectFactory<?>> singletonFactories = new HashMap<>(16);

    // 先从一级缓存开始找 二级 三级

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("dependence.xml");
    }

}
