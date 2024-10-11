package com.big.test;

import com.big.service.UserService;
import com.big.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 目标对象 Target  被增强的方法所在的类
 * 代理对象 Proxy   对目标对象增强后的对象，客户端时间调用的对象
 * 连接点   JoinPoint 目标对象中可以被增强的方法
 * 切入点   PointCut  目标对象中实际被增强的方法
 * 通知、增强 Advice   增强部分的代码逻辑
 * 切面     Aspect  增强和切入点的组合
 * 织入     Weaving  将通知和切入点组合的动态组合的过程
 *
 * @author Yin
 * @date 2024-10-11 14:11
 */
public class ApplicationAopTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean(UserService.class);

        userService.getUser();
        userService.delUser();
    }
}
