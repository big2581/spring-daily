package com.big.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 注解切面
 *
 * @author Yin
 * @date 2024-10-11 17:15
 */
@Component
@Aspect
public class AnnotationAdvice {
    //表示它是一个切入点表达式
    //引入方式直接类名.方法名()
    @Pointcut("execution(* com.big.service.impl.UserServiceImpl.getUser(..))")
    public void commonExecution() {
    }

    @Before(value = "AnnotationAdvice.commonExecution()")
    public void before() {
        System.out.println("前置通知。。。。。");
    }

    @After(value = "AnnotationAdvice.commonExecution()")
    public void after() {
        System.out.println("最终通知。。。。。");
    }

    @Around(value = "AnnotationAdvice.commonExecution()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知。。。。。前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知。。。。。后");
    }

    @AfterReturning(value = "AnnotationAdvice.commonExecution()")
    public void afterReturning() {
        System.out.println("后置通知。。。。。");
    }

    //异常通知需要指定参数名
    @AfterThrowing(value = "AnnotationAdvice.commonExecution()", throwing = "e")
    public void throwable(Throwable e) {
        System.out.println("异常通知。。。。。");
    }

}
