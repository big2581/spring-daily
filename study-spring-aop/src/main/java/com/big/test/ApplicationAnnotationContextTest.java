package com.big.test;

import com.big.config.SpringConfig;
import com.big.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试注解aop
 *
 * @author Yin
 * @date 2024-10-11 17:22
 */
public class ApplicationAnnotationContextTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.getUser();
    }
}
