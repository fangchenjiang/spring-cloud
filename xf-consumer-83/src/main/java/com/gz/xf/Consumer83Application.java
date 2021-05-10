package com.gz.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.swing.*;

/**
 * @Description 83消费者主启动类
 * @Author Fangchenjiang
 * @Date 2021/5/10 21:36
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Consumer83Application {
    public static void main(String[] args) {

        SpringApplication.run(Consumer83Application.class,args);
    }
}
