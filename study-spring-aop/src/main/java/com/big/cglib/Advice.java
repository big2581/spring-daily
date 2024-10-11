package com.big.cglib;

/**
 * 增强类
 *
 * @author Yin
 * @date 2024-10-11 16:59
 */
public class Advice {
    public void before() {
        System.out.println("cglib before 前置通知");
    }

    public void after() {
        System.out.println("cglib after 后置通知");
    }
}
