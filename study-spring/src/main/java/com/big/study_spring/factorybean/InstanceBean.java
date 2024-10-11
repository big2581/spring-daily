package com.big.study_spring.factorybean;

import com.big.study_spring.service.UserService;
import com.big.study_spring.service.impl.UserServiceImpl;

/**
 * 静态工厂bean
 *
 * @author Yin
 * @date 2024-10-07 17:04
 */
public class InstanceBean {

    public UserService getUserServiceImpl() {
        System.out.println("实例化工厂初始化bean");
        return new UserServiceImpl();
    }
}
