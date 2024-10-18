package com.big.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 项目启动后执行 ApplicationRunner 和 CommandLineRunner 是一样的功能
 * 作用：
 *     缓存预热  提交放到缓存
 *
 * @author Yin
 * @date 2024-10-17 16:32
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner 开始执行" + args);
    }
}
