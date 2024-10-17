package com.big.config;

import com.big.Annotations.ConditionClassName;
import com.big.bean.User;
import com.big.conditions.MyCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author Yin
 * @date 2024-10-17 13:55
 */

@Configuration
public class ConfigBean {

    @Bean
    @ConditionClassName("abv") //自定义的
//    @ConditionalOnBean spring提供的 有那个Bean对象才
//    @ConditionalOnClass  有哪个字节码文件
//    @ConditionalOnProperty  有哪个配置文件属性
    public User user() {
        return new User();
    }
}
