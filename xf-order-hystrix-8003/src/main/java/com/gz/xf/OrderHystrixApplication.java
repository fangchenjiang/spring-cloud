package com.gz.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Description Hystrix主启动类
 * @Author Fangchenjiang
 * @Date 2021/4/6 23:04
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableCircuitBreaker
public class OrderHystrixApplication {
    public static void main(String[] args) {

        SpringApplication.run(OrderHystrixApplication.class,args);
    }


}
