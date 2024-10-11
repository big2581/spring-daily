package com.big.processors;

import com.big.advice.MyAdvice;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * bean 的后置处理器
 *
 * @author Yin
 * @date 2024-10-11 14:04
 */
public class MyBeanPostProcessor implements BeanPostProcessor, ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().getPackage().getName().equals("com.big.service.impl")) {
            Object newProxyInstance = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                    MyAdvice myAdvice = applicationContext.getBean(MyAdvice.class);

                    myAdvice.before();
                    Object invoke = method.invoke(bean, args);
                    myAdvice.after();

                    return invoke;
                }
            });
            return newProxyInstance;
        }
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
