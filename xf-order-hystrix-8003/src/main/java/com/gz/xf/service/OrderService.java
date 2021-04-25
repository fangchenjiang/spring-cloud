package com.gz.xf.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;

/**
 * @Description 订单业务类
 * @Author Fangchenjiang
 * @Date 2021/4/6 23:10
 */
@Service
public class OrderService {
    public static int timeUnit=5;


    public String ok(Long id){
        System.out.println("线程:"+Thread.currentThread()+"is OK");
        return "线程:"+Thread.currentThread()+"is OK";

    }


    @HystrixCommand(fallbackMethod = "timeOutHandler")
    public String timeOut(Long id){
        int a=10/0;
//        try {
//            TimeUnit.SECONDS.sleep(timeUnit);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("线程:"+Thread.currentThread().getName()+"is TimeOut for "+timeUnit+"s");
             return "线程:"+Thread.currentThread().getName()+"is TimeOut for "+timeUnit+"s";

    }

    public String timeOutHandler(Long id){
        return "线程:"+Thread.currentThread().getName()+"调用8001繁忙,请稍后再试o(╥﹏╥)o";
    }

    @HystrixCommand(fallbackMethod = "circuitBreakerHandler",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")})

    public String  circuitBreaker(Long id){
        if (id<0){
            throw  new RuntimeException("id不能为负数");
        }
        return "服务请求正常:"+id;
    }

    public String circuitBreakerHandler( Long id){
        return "服务熔断触发:o(╥﹏╥)o";
    }
}
