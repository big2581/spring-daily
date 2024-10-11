package com.big.bean;

import com.alibaba.druid.pool.DruidDataSource;
import com.big.dao.UserDao;
import com.big.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 * 非自定义bean（来自第三方的bean）
 *
 * @author Yin
 * @date 2024-10-10 17:16
 */
//@Component
public class OtherBean {

    //    @Bean //默认Bean的名称就是 方法名
    @Bean("datasource") //或者指定方法名
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://192.168.19.192:32570/aicm");
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("aicm@2022");
        return druidDataSource;
    }

    @Bean //可以通过属性参数注入
    public DataSource druidDatasource(@Value("${jdbc.url}") String url,
                                      @Value("${jdbc.driver}") String driver,
                                      @Value("${jdbc.username}") String username,
                                      @Value("${jdbc.password}") String password,
                                      @Autowired UserService userService,
                                      @Autowired @Qualifier("userDaoImpl") UserDao userDao,
                                      @Qualifier("userDaoImpl2") UserDao userDao2,
                                      UserService userService2) {

        System.out.println("start ###################");

        System.out.println("参数上通过@Autowired 注入： " + userService);
        System.out.println("参数上通过@Autowired @Qualifier  指定名称注入： " + userDao);
        System.out.println("参数上通过@Qualifier 名称注入： " + userDao2);
        System.out.println("无需注解参数注入： " + userService2);

        System.out.println("end ###################");

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

}
