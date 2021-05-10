package com.gz.xf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description Payment控制器
 * @Author Fangchenjiang
 * @Date 2021/5/10 21:37
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    String port;


    @GetMapping("/getPort/{id}")
    public String getPort(@PathVariable("id")Long id){
        return "server port:"+port+","+"id:"+id;
    }
}
