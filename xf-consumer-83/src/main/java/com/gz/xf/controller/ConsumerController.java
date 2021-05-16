package com.gz.xf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description 消费者控制器
 * @Author Fangchenjiang
 * @Date 2021/5/10 21:40
 */
@RestController
@RequestMapping("/consumer")
@RefreshScope
public class ConsumerController {
    public static String SERVICE_URL="http://xf-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/payment/{id}")
    public String getPort(@PathVariable("id")Long id){

        String s = restTemplate.getForObject(SERVICE_URL + "/payment/getPort/" + id, String.class);
        return s;
    }
}
