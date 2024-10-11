package com.big.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 *
 * @author Yin
 * @date 2024-10-11 17:32
 */
@Configuration
@ComponentScan("com.big")
@EnableAspectJAutoProxy //替代的    <aop:aspectj-autoproxy/>
public class SpringConfig {

}
