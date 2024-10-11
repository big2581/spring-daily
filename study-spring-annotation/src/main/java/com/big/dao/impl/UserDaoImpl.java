package com.big.dao.impl;

import com.big.dao.UserDao;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 *
 *
 * @author Yin
 * @date 2024-10-10 16:49
 */
@Repository
@Primary //按照类型注入 @Autowired // 加上@Primary 优先注入
//@Profile("test") // 当前指定环境才生效 默认所有环境下都生效
// 通过修改system.setProperties("spring.profiles.active","test") 或者 -Dspring.profiles.active=test
public class UserDaoImpl implements UserDao {
}
