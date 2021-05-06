package com.gz.xf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Description 消费者Controller
 * @Author Fangchenjiang
 * @Date 2021/5/6 20:48
 */
@Component
@EnableBinding(Sink.class)
public class ConsumerController {

    @Value("${server.port}")
    private String port;

    //消费者
    @StreamListener(Sink.INPUT)
    private void  consumerMessage(Message<String>message){
        System.out.println("消费者接收:"+message.getPayload()+"\t"+"port:"+port);

    }
}
