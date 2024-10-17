package com.big.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Yin
 * 三种获取属性文件的内容的三种方式
 * //@Value("person")
 * //Environment 类获取属性key
 * //@ConfigurationProperties 注解 自动注入对象属性
 *
 *
 * @date 2024-10-17 10:49
 */
@ConfigurationProperties("person")
@Component
@EnableConfigurationProperties
public class PersonDTO {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
