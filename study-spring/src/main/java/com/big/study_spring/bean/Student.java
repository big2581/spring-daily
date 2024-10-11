package com.big.study_spring.bean;

import com.big.study_spring.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * 注入示例参考
 * set方法注入
 * 构造参数注入
 * 类型：
 * 基本数据类型
 * 引用数据类型
 * 集合数据类型
 *
 * @author Yin
 * @date 2024-10-07 17:47
 */
public class Student {
    private String name;
    private int age;
    private UserService userService;
    private List<String> list;
    private Map<String, String> maps;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

}
