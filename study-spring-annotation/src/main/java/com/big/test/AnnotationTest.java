package com.big.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.big.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解开发
 *
 * @author Yin
 * @date 2024-10-10 16:18
 */
public class AnnotationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        System.out.println(userService);
        userService.show();
        System.out.println("-----------------------------");
        DruidDataSource datasource = (DruidDataSource)context.getBean("datasource");
        System.out.println(datasource);
        System.out.println("-----------------------------");
        DruidDataSource datasource2 = (DruidDataSource)context.getBean("druidDatasource");
        System.out.println(datasource2);

        context.close();
    }
}
