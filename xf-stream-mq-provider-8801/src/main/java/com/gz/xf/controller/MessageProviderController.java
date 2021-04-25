package com.gz.xf.controller;

import com.gz.xf.service.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 消息发送Controller
 * @Author Fangchenjiang
 * @Date 2021/4/25 23:27
 */
@RestController
@RequestMapping("/mq")
public class MessageProviderController {

    @Autowired
    private ProduceService produceService;
    @GetMapping("/send")
    public String sendMsg(){
        String send = produceService.send();
        return send;
    }
}
