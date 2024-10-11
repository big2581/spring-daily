package com.big.test;

import com.big.mapper.TaskMapper;
import com.big.pojo.Task;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * spring 整合第三方框架 mybatis
 *
 * @author Yin
 * @date 2024-10-10 10:33
 */
public class MyBatisSpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        SqlSessionFactory factory = context.getBean(SqlSessionFactory.class);
        TaskMapper mapper = factory.openSession().getMapper(TaskMapper.class);
        List<Task> limitTen = mapper.getLimitTen();
        for (Task task : limitTen) {
            System.out.println(task.getVip_id());
        }

    }
}
