package com.gz.xf.controller;

import com.gz.xf.feign.OrderFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 客户端Controller
 * @Author Fangchenjiang
 * @Date 2021/4/5 11:10
 */
@RestController
@RequestMapping("/consumer")
@DefaultProperties(defaultFallback = "globalHandler")
public class ClientController {

    @Autowired
    OrderFeignService orderFeignService;
    @GetMapping("/getPort")
    public String getPort(){
        String port = orderFeignService.getPort();
        return port;
    }

    @GetMapping("/timeOut")
    public String timeOut(){
        String timeOut = orderFeignService.timeOut();
        return timeOut;
    }

    @RequestMapping("/timeOut/{id}")
    @HystrixCommand
//    @HystrixCommand(fallbackMethod = "consumerHandler")
    public String timeOut(@PathVariable("id")Long id){
        int a=10/0;
       return orderFeignService.timeOut(id);
    }

    /**
     * 全局降级处理
     * @return
     */
    public String globalHandler(){
        return "全局降级处理,o(╥﹏╥)o";
    }

    @RequestMapping("/ok/{id}")
    public String ok(@PathVariable("id")Long id){
        return orderFeignService.ok(id);
    }


    public String consumerHandler(Long id){

        return "我是消费者,出现故障,请稍后重试" ;
    }

}
