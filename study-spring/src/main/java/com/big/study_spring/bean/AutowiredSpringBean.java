package com.big.study_spring.bean;

import com.big.study_spring.service.UserService;

/**
 * 自动装配
 *
 * @author Yin
 * @date 2024-10-08 9:17
 */
public class AutowiredSpringBean {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
        System.out.println(userService);
    }
}
