package com.gz.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description 配置客户端主启动类
 * @Author Fangchenjiang
 * @Date 2021/5/16 19:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigApplication {
    public static void main(String[] args) {

        SpringApplication.run(ConfigApplication.class,args);
    }
}
