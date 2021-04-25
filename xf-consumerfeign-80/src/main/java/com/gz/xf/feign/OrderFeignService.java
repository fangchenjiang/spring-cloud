package com.gz.xf.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "xf-order")
@RequestMapping("/order")
public interface OrderFeignService {
    @GetMapping("/getPort")
    String getPort();

    @GetMapping("/timeOut")
    public String timeOut();


    @RequestMapping("/ok/{id}")
    public String ok(@PathVariable("id")Long id);

    @RequestMapping("/timeOut/{id}")
    public String timeOut(@PathVariable("id")Long id);

}
