package com.ctrip.arch.springboot.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 金凯 on 2017/8/20.
 */
@RestController
public class IndexController {

    @RequestMapping("/hello")
    public String home() {
        return "hello world! ";
    }
}
