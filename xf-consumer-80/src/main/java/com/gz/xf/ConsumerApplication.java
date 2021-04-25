package com.gz.xf;

import my.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;


/**
 * @Description 消费者客户端
 * @Author Fangchenjiang
 * @Date 2021/4/3 22:51
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(value = "xf-order",configuration = MyRule.class) //指定具体的负载均衡替换类和key
public class ConsumerApplication {
    public static void main(String[] args) {

        SpringApplication.run(ConsumerApplication.class,args);
    }
}
