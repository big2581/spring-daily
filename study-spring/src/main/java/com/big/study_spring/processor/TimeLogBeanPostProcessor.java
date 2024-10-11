package com.big.study_spring.processor;

import com.big.study_spring.bean.XxxBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 只针对XxxBean对象的getName方法时记录时间日志
 *
 * @author Yin
 * @date 2024-10-08 13:45
 */
public class TimeLogBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof XxxBean) {
            Object newProxy = Proxy.newProxyInstance(
                    bean.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(),
                    (proxy, method, args) -> {
                        Object result = null;
                        String name = method.getName();
                        if ("getName".equals(name)) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            System.out.println("TimeLog: " + method.getName() + "执行之前记录时间：" + simpleDateFormat.format(new Date()));
                            result = method.invoke(bean, args);
                            System.out.println("TimeLog: " + method.getName() + "执行之后记录时间：" + simpleDateFormat.format(new Date()));
                        } else {
                            result = method.invoke(bean, args);
                        }
                        return result;
                    });
            return newProxy;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
