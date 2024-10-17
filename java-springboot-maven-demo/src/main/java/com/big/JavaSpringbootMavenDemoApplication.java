package com.big;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * @author Yin
 * @apiNote SpringBoot 主要的就是约定大约配置
 * springboot 都是自动装配的 功能都能在配置上修改
 * <p>
 * profile 多profile文件方式：提供多个配置环境，每一个代表一种
 * application-dev.yml
 * application-test.yml
 * application-prod.yml
 * <p>
 * 在文件中 --- 分割不同配置
 * <p>
 * 激活的profile的方式有三种
 * <p>
 * 配置文件
 * yml 配置文件 spring.profiles.active=dev
 * 虚拟机参数 vm.options指定 -Dspring.profiles.active=test
 * 命令行参数 java -jar --spring.profiles.active=prod
 * <p>
 * <p>
 * 配置文件的加载顺序 （所有文件都是互补，存在则被优先级高的所替换）
 * 文件后置优先级
 * properties > yml > yaml
 * 文件位置优先级（由低到高）
 * 项目下的classpath(resources) 下的application.yml
 * 父项目下的 application-test.yml （没有resource 和pom.xml平行）
 * 项目下的classpath(resources)/config 下的application.yml
 * <p>
 * java -jar -Dspring.profiles.active=application-test.yml 指定文件部署
 * <p>
 * 1. 项目下的application.yml
 * 2. 项目下的application.yaml
 * 3. 项目下的application.properties
 * @date 2024/10/17 09:07
 */
@SpringBootApplication
public class JavaSpringbootMavenDemoApplication {

    public static void main(String[] args) {
        //自定义SpringBootApplication
        SpringApplication springApplication = new SpringApplication(JavaSpringbootMavenDemoApplication.class);
        //关闭banner
        springApplication.setBannerMode(Banner.Mode.OFF);


        ConfigurableApplicationContext run = springApplication.run(args);

//        Object user = run.getBean("user");
        Jedis jedis = run.getBean(Jedis.class);
        System.out.println(jedis);
    }

}
