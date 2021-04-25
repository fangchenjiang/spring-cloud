package com.gz.xf.controller;

import com.gz.xf.config.impl.MyLB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @Description 消费者COntroller
 * @Author Fangchenjiang
 * @Date 2021/4/3 23:03
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    MyLB myLB;
    private  static String  URL="http://xf-order/";
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/getById/{id}")
    public String getOrderByID(@PathVariable("id")Long id){
        List<ServiceInstance> instances = discoveryClient.getInstances("xf-order");
        ServiceInstance instance = myLB.getInstance(instances);
        URI uri = instance.getUri();
        String  url=uri+"/order/getPay/"+id;
        String object = restTemplate.getForObject(url, String.class);
        return object;
    }


}
