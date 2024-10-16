package com.big.test;

import com.big.config.SpringConfig;
import com.big.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 *
 * @author Yin
 * @date 2024-10-14 16:22
 */
public class AopAccountTXTest {
    public static void main(String[] args) {
        //xml配置
//        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContextTrans.xml");
        //注解配置
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = applicationContext.getBean(AccountService.class);
        System.out.println(accountService);
        accountService.transAccount("tom", "xiaoq", 100);
    }
}

