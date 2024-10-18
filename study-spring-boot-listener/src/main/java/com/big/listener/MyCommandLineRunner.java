package com.big.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 项目启动后执行
 *
 * @author Yin
 * @date 2024-10-17 16:31
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner 接口开始执行。。。" + args);
    }
}
