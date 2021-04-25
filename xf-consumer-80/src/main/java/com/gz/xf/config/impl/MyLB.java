package com.gz.xf.config.impl;

import com.gz.xf.config.XfLoadBalancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description 自定义负载均衡类
 * @Author Fangchenjiang
 * @Date 2021/4/4 18:47
 */
@Component
public class MyLB  implements XfLoadBalancer{

    @Autowired
    DiscoveryClient discoveryClient;
    public AtomicInteger serverCount=new AtomicInteger(0);

    @Override
    public ServiceInstance getInstance(List<ServiceInstance> serviceInstanceList) {
        int index=getNextIndex()%serviceInstanceList.size();
        return serviceInstanceList.get(index);
    }



    public final  int getNextIndex(){

        int current;
        int next;

        do{
            current=this.serverCount.get();
            next=current>=2147483167?0:current+1;
        }while (!this.serverCount.compareAndSet(current,next));
            System.out.println("第"+next+"几次访问");
            return next;

    }
}
