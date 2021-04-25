package com.xf.gz.order.controllrt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Description 订单Controllerlei
 * @Author Fangchenjiang
 * @Date 2021/3/29 21:22
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Value("${server.port}")
    String port;
    @Autowired
    RestTemplate restTemplate;
    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/getDiscovery")
    public Object getDiscoveryClient(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {

            System.out.println("service:"+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("xf-order");
        for (ServiceInstance instance : instances) {

            System.out.println("host:"+instance.getHost()+"\t"+"port:"+instance.getPort()+"\t"+"uri:"+instance.getUri());
        }
        return discoveryClient;
    }

    @GetMapping("/getPay/{id}")
    public String getPay(@PathVariable("id")Long id){
//        ResponseEntity<String> forEntity = restTemplate.getForEntity("", String.class);
//        String body = forEntity.getBody();
//        return body;
        return "请求到了订单服务,端口号:"+port;
    }

    @GetMapping("/getPort")
    public String getPort(){
        return "请求到了订单服务,端口号:"+port;
    }

    @GetMapping("/timeOut")
    public String timeOut() {
        //暂停3秒
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "请求到了订单服务,端口号:"+port;
    }
}
