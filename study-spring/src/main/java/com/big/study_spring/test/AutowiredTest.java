package com.big.study_spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.DriverManager;

/**
 * 自动装配
 *
 * @author Yin
 * @date 2024-10-08 9:24
 */
public class AutowiredTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("autowireSpring.xml");
//        Object autoBeanType = context.getBean("autoBeanType");
//        System.out.println(autoBeanType);
//        Object autoBeanName = context.getBean("autoBeanName");
//        System.out.println(autoBeanName);

        /**
         * @apiNote
         * xml自定义标签
         * xml默认标签
         *      <beans></beans>
         *      <bean></bean>
         *      <import></import>
         *      <alias></profile>
         * @param args
         * @author Yin
         * @date 2024/10/08 09:38
         */
//        System.setProperty("spring.profiles.active", "dev");
//        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("autowireSpring.xml");
//        Object user1 = context.getBean("user1");
//        System.out.println(user1);
//
//        Object dataSource = context.getBean("dataSource");
//        System.out.println(dataSource);

//        Object connection = context.getBean("connection");
//        System.out.println(connection);


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowireSpring.xml");
        Object person = context.getBean("person");
        System.out.println(person);
        Object person2 = context.getBean("person2");
        System.out.println(person2);

    }
}
