package com.big.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * 配置类
 *
 * @author Yin
 * @date 2024-10-11 17:32
 */
@Configuration
@ComponentScan("com.big")
@MapperScan("com.big.mapper")
@EnableAspectJAutoProxy //替代的    <aop:aspectj-autoproxy/>
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
public class SpringConfig {

    @Bean
    public DruidDataSource dataSource(@Value("${jdbc.driver}") String driverName,
                                      @Value("${jdbc.username}") String username,
                                      @Value("${jdbc.password}") String password,
                                      @Value("${jdbc.url}") String url) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverName);
        druidDataSource.setPassword(password);
        druidDataSource.setUsername(username);
        druidDataSource.setUrl(url);

        return druidDataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DruidDataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DruidDataSource druidDataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(druidDataSource);
        return dataSourceTransactionManager;
    }

}
