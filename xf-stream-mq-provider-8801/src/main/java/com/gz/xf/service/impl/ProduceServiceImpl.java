package com.gz.xf.service.impl;

import com.gz.xf.service.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Description 消息生产者业务类
 * @Author Fangchenjiang
 * @Date 2021/4/25 23:03
 */
@EnableBinding(Source.class)    //消息通道源头
public class ProduceServiceImpl implements ProduceService{

    @Resource
    private MessageChannel output;   //消息发送端

    @Override
    public String send() {
        String value= UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(value).build());
        System.out.println("流水号:"+value);
        return value;
    }
}
