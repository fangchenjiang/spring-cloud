package com.gz.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 消息生生产者启动类
 * @Author Fangchenjiang
 * @Date 2021/4/25 23:01
 */
@SpringBootApplication
@EnableEurekaClient
public class MQProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MQProviderApplication.class,args);
    }
}
