package com.big;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * redis配置属性类
 *
 * @author Yin
 * @date 2024-10-17 15:51
 */
@ConfigurationProperties(value = "redis")
public class RedisConfigProperties {
    private String host;
    private Integer port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
