package com.big.service.impl;

import com.big.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 实际业务类
 * 这个bean 目标对象 target
 *
 * 里面所有的方法 叫做 连接点   joincut
 * 实际被增强的方法 叫做 切入点  pointcut
 *
 * @author Yin
 * @date 2024-10-11 14:01
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void getUser() {
//        int i = 1/0;
        System.out.println("获取用户信息");
    }

    @Override
    public void delUser() {
        System.out.println("删除用户信息");
    }
}
