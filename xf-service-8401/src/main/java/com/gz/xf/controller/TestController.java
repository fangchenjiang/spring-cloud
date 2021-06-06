package com.gz.xf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试Controller
 * @Author Fangchenjiang
 * @Date 2021/5/20 22:56
 */
@RestController
public class TestController {

    @GetMapping("/testA")
    public String  testA(){
        return "testA";

    }
}
