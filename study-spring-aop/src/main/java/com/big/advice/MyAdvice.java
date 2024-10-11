package com.big.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 增强类
 * 方法是增强 Advice
 * @author Yin
 * @date 2024-10-11 14:02
 */
public class MyAdvice {

    public void before(){
        System.out.println("增强之前打印");
    }
    public void after(){
        System.out.println("增强之后打印");
    }

    /**
     * @apiNote 有三个参数
     * @param proceedingJoinPoint joinPoint子对象，主要在环绕通知执行proceed()，进而进行目标方法
     * @param joinPoint 连接点对象，任何通知都可以使用，可以获得当前目标对象，目标方法参数等信息
     * @param throwable 异常对象，使用在异常通知中，需要在配置文件中指定异常对象名称
     * @author Yin
     * @date 2024/10/11 15:45
     */
    public void around(ProceedingJoinPoint proceedingJoinPoint, JoinPoint joinPoint,Throwable throwable) throws Throwable {


        System.out.println("环绕增强之前打印");
        proceedingJoinPoint.proceed();
        System.out.println("环绕增强之后打印");
    }
}
