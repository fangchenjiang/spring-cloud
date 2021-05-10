package com.gz.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description 支付主启动类
 * @Author Fangchenjiang
 * @Date 2021/5/10 21:12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9001Application {

    public static void main(String[] args) {

        SpringApplication.run(Payment9001Application.class,args);
    }
}
