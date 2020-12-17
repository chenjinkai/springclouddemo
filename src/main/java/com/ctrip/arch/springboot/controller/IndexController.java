package com.ctrip.arch.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 金凯 on 2017/8/20.
 */
@RestController
public class IndexController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world! ";
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "hello " + name;
    }
}
