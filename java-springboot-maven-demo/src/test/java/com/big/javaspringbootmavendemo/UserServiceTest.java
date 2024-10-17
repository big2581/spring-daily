package com.big.javaspringbootmavendemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

/**
 * 
 *
 * @author Yin
 * @date 2024-10-17 13:13
 */
@SpringBootTest
public class UserServiceTest {
    
//    @Autowired
//    private RedisTemplate redisTemplate;

    @Test
    void abc(){
//        Set keys = redisTemplate.keys();
//        Set keys = redisTemplate.keys("User:*");
//        keys.forEach(System.out::println);
        System.out.println("123");
    }

}
