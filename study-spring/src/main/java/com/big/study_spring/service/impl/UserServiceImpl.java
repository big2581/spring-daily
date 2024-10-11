package com.big.study_spring.service.impl;

import com.big.study_spring.dao.UserDao;
import com.big.study_spring.service.UserService;
import org.springframework.beans.factory.InitializingBean;

/**
 * TODO
 *
 * @author Yin
 * @date 2024-10-07 15:05
 */
public class UserServiceImpl implements UserService, InitializingBean {

    public UserServiceImpl() {
        System.out.println("UserServiceImpl 无参构造");
    }

    public UserServiceImpl(String name) {
        System.out.println("UserServiceImpl 有参构造name" + name);
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("当前属性在xml被注入：" + userDao);
    }

    public void init() {
        System.out.println("初始化方法");
    }

    public void destroy() {
        System.out.println("销毁方法");
    }

    /**
     * @apiNote 可以在xml文件上不定义init-method方法
     * 实现InitializingBean 容器会自动帮你调用初始化方法
     * @author Yin
     * @date 2024/10/07 16:49
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("实现InitializingBean：初始化方法");
    }
}
