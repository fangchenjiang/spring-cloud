package com.gz.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description MQ消费者主启动类
 * @Author Fangchenjiang
 * @Date 2021/5/6 20:28
 */
@SpringBootApplication
public class MQConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MQConsumerApplication.class,args);
    }
}
