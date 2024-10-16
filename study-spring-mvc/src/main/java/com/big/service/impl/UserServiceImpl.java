package com.big.service.impl;

import com.big.service.UserService;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author Yin
 * @date 2024-10-15 13:37
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getOneUser() {
        return "张三";
    }
}
