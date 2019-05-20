package com.himalaya;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
public class Config {

    @Bean
    public LettuceConnectionFactory connectionFactory() {

        RedisStandaloneConfiguration redisConf = new RedisStandaloneConfiguration();
        redisConf.setHostName("49.247.211.14");
        redisConf.setPort(6379);
        return new LettuceConnectionFactory(redisConf);
    }
}
