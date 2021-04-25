package com.gz.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 网关启动类
 * @Author Fangchenjiang
 * @Date 2021/4/24 14:52
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GateWayApplication {
    public static void main(String[] args) {

        SpringApplication.run(GateWayApplication.class,args);
    }
}
