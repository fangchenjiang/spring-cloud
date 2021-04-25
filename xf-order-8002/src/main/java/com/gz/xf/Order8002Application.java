package com.gz.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description 订单启动类
 * @Author Fangchenjiang
 * @Date 2021/3/28 23:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Order8002Application {

    public static void main(String[] args) {
        SpringApplication.run(Order8002Application.class,args);
    }
}
