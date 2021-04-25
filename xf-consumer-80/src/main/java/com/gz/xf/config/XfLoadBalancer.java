package com.gz.xf.config;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface XfLoadBalancer {

   ServiceInstance getInstance(List<ServiceInstance>serviceInstanceList);
}
