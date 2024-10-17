package com.big;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * 自动装配类
 *
 * @author Yin
 * @date 2024-10-17 15:51
 */
@Configuration
@EnableConfigurationProperties(RedisConfigProperties.class)
@ConditionalOnClass(Jedis.class)
public class RedisAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean(name = "jedis")
    public Jedis jedis(RedisConfigProperties redisConfigProperties) {
        return new Jedis(redisConfigProperties.getHost(), redisConfigProperties.getPort());
    }



}
