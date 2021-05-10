package com.gz.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description 9002支付主启动类
 * @Author Fangchenjiang
 * @Date 2021/5/10 21:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9002Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment9002Application.class,args);
    }
}
