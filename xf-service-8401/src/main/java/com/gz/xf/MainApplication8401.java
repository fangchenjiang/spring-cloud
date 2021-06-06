package com.gz.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description 主启动类
 * @Author Fangchenjiang
 * @Date 2021/5/20 22:55
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApplication8401 {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication8401.class,args);
    }
}
