package com.big.service.impl;

import com.big.dao.UserDao;
import com.big.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import sun.reflect.generics.tree.VoidDescriptor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

/**
 * bean标签被注解替代
 *
 * @author Yin
 * @date 2024-10-10 16:21
 */
//@Component(value = "userServiceImpl")
//@Component("userServiceImpl")
@Component //默认 小写 userServiceImpl
//@Lazy
@Lazy(value = true) //bean 标签 lazy
//bean 标签中 scope
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON) //默认单例
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE ) //多例
// @Component 注解衍生出三个 注解 表示在不同逻辑层上的区分  没有实际意义 只做标识
//@Service  //业务层
//@Controller //控制器层
//@Repository //dao层 数据库层
public class UserServiceImpl implements UserService {

    //以下注解 可以用在字段或者方法上使用
    //    @Value
    //    @Autowired
    //    @Qualifier
    //    @Resource

    //注入在属性上的注解
    @Value(value = "${user.username}")
    private String username;

    //    @Autowired //根据类型注入，当匹配的类型有多个bean时 会根据名称（要注入的属性名 userDao）去匹配一次，当多个bean名称未匹配上就出现异常
//    @Qualifier("userDaoImpl") //配合@Autowired注解 注入指定的bean对象 防止注入失败
    @Resource(name = "userDaoImpl") //不指定名称参数时 先根据类型注入，有名称参数安装指定名称对象注入
    private UserDao userDao;

    //    @Value(value = "${user.username}")  //可以在方法上注入
    public void setUsername(String username) {
        this.username = username;
    }

    //    @Autowired
//    @Qualifier("userDaoImpl") // 可以在方法上注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    @Qualifier("userDaoImpl")//Autowired 可以用在任意方法上 通过参数类型名称注入
    public void xxxMethod(UserDao userDao) {
        System.out.println("xxxMethod方法注入 " + userDao);
    }

    public void show() {
        System.out.println("属性注入： " + username);
        System.out.println("引用对象注入： " + userDao);
    }


    public UserServiceImpl() {
        System.out.println("userServiceImpl 实例化完成....");
    }

    //等于bean标签中的 init-method
    @PostConstruct
    public void init() {
        System.out.println("执行初始化方法....");
    }

    //等于bean标签中的 destroy-method
    @PreDestroy
    public void destroy() {
        System.out.println("执行销毁方法");
    }
}
