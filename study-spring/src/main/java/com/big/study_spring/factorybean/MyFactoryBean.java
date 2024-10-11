package com.big.study_spring.factorybean;

import com.big.study_spring.service.UserService;
import com.big.study_spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * 实现FactoryBean 接口 不需要像静态工厂实例化bean、实例化工厂初始化bean
 * 不需要需要指定工厂方法 只要创建好对应的bean就可以
 *
 * @author Yin
 * @date 2024-10-07 17:26
 */
public class MyFactoryBean implements FactoryBean<UserService> {

    /**
     * @apiNote 这个要等到实际调用的时候才会去创建，并放在factoryBeanObjectCache 中 延迟创建
     * @return com.big.study_spring.service.impl.UserServiceImpl
     * @author Yin
     * @date 2024/10/07 17:42
     */
    @Override
    public UserServiceImpl getObject() throws Exception {
        System.out.println("MyFactoryBean 返回对象");
        return new UserServiceImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
