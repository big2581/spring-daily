package com.big.study_spring.test;

import com.big.study_spring.dao.UserDao;
import com.big.study_spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * TODO
 *
 * @author Yin
 * @date 2024-10-07 15:10
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        //创建工厂
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //创建文件读取器
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        //读取配置文件给工厂
        xmlBeanDefinitionReader.loadBeanDefinitions("spring.xml");
        //根据id获取bean对象
        UserServiceImpl userService = beanFactory.getBean(UserServiceImpl.class);
        System.out.println(userService);

        UserDao userDao = beanFactory.getBean(UserDao.class);
        System.out.println(userDao);

    }
}
