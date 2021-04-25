package com.gz.xf.config;

import feign.Logger;
import feign.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description Feign配置类
 * @Author Fangchenjiang
 * @Date 2021/4/5 12:16
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level level(){
        return Level.FULL;
    }
}
