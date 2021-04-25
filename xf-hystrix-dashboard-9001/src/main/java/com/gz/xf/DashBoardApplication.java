package com.gz.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * @Description 控制台启动类
 * @Author Fangchenjiang
 * @Date 2021/4/20 23:06
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class DashBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(DashBoardApplication.class,args);
    }
}
