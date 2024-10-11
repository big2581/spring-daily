package com.big.test;

import com.big.mapper.TaskMapper;
import com.big.pojo.Task;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 单独使用mybatis
 *
 * @author Yin
 * @date 2024-10-10 10:38
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
        List<Task> limitTen = mapper.getLimitTen();
        for (Task task : limitTen) {
            System.out.println(task.getVip_id());
        }
    }
}
