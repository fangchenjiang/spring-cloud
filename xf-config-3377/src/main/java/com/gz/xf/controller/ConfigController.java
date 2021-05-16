package com.gz.xf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 配置类Controller
 * @Author Fangchenjiang
 * @Date 2021/5/16 19:11
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class ConfigController {


    @Value("${config.info}")
    private String configInfo;
    @GetMapping("/getConfig")
    public String getConfigInfo(){
        return configInfo;
    }
}
