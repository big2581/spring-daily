package com.big.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Advice接口定义不同类型的通知
 *
 * @author Yin
 * @date 2024-10-11 15:59
 */
public class CustomAdvice implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("通过Advice接口 实现后置通知。。。。。"+ method.getName());
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("通过Advice接口  实现前置通知。。。。。" + method.getName());
    }
}
