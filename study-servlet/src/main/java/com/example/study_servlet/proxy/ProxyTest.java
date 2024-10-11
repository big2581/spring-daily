package com.example.study_servlet.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author Yin
 * @date 2024-09-30 14:40
 */
public class ProxyTest {

    public static void main(String[] args) {
        Huawei huawei = new Huawei();
        //动态代理
        SaleComputer proxyInstance = (SaleComputer) Proxy.newProxyInstance(
                huawei.getClass().getClassLoader(),//类加载器
                huawei.getClass().getInterfaces(),//接口数组 真实的接口
                //实际的处理器
                new InvocationHandler() {
                    /**
                     * @apiNote
                     * @param proxy 代理对象 - 华为
                     * @param method 代理方法 封装好的Method
                     * @param args 代理对象调用的方法时，传递的实际参数
                     * @return java.lang.Object
                     * @author Yin
                     * @date 2024/09/30 14:46
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println(method.getName() + "代理方法被执行。。。。。。");
                        method.invoke(huawei, args);
                        return null;
                    }
                });
        proxyInstance.sale();
    }
}
