package com.big.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;


/**
 * 使用cglib的处理方式
 *
 * @author Yin
 * @date 2024-10-11 16:59
 */
public class CglibTest {

    public static void main(String[] args) {
        //目标对象
        Target target = new Target();
        //增强类
        Advice advice = new Advice();
        //cglib
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调地址
        enhancer.setCallback((InvocationHandler) (o, method, objects) -> {
            advice.before();
            //执行方法
            Object invoke = method.invoke(target, objects);
            advice.after();

            return invoke;
        });
        //创建代理对象
        Target o = (Target) enhancer.create();
        //调用代理对象的方法
        o.display();
    }
}
