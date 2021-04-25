package com.gz.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description 客户端feign主启动类
 * @Author Fangchenjiang
 * @Date 2021/4/5 11:04
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class ConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class,args);
    }
}
