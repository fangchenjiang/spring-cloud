package com.gz.xf.controller;

import com.gz.xf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 订单Controller
 * @Author Fangchenjiang
 * @Date 2021/4/6 23:08
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequestMapping("/ok/{id}")
    public String ok(@PathVariable("id")Long id){
        return orderService.ok(id);

    }


    @RequestMapping("/timeOut/{id}")
    public String timeOut(@PathVariable("id")Long id){
        return orderService.timeOut(id);
    }


    @GetMapping("/breaker/{id}")
    public String myBreak(@PathVariable("id")Long id){

        String s = orderService.circuitBreaker(id);
        return s;
    }

}
