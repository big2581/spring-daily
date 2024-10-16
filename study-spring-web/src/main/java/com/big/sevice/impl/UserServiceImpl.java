package com.big.sevice.impl;

import com.big.sevice.UserService;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author Yin
 * @date 2024-10-15 10:48
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void finUser() {
        System.out.println("查询用户。。。。");
    }
}
