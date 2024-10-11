package com.big.config;

import com.big.anno.CustomAnnotation;
import com.big.bean.OtherBean;
import com.big.imports.CustomImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * 注解配置类
 *
 * @author Yin
 * @date 2024-10-10 17:57
 */
@Configuration  //标志他是一个配置类  + @Component 能被spring管理
@ComponentScan({"com.big"}) //替代bean标签中的     <context:component-scan base-package="com.big"/>
@PropertySource({"classpath:application.properties","classpath:jdbc.properties"})//替代bean标签中的  <context:property-placeholder location="classpath:*.properties"/>
//@Import(OtherBean.class) //替代bean标签中的     <import resource="classpath:"></import>
//@Import(CustomImportSelector.class) //导入一个导入类 能自动的导入一些到spring
//@CustomAnnotation //引入一个注解 帮你导入一个类的注入spring  一共三种方式
public class SpringConfig {

}
