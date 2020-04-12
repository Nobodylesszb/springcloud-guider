package com.bo.feighservice.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: bo
 * @Date: 2020/4/12 16:13
 * @Version:
 * @Description:
 */

@Configuration
public class FeighConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
