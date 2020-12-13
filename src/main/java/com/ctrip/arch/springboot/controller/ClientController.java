package com.ctrip.arch.springboot.controller;

import com.ctrip.arch.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "ribbon/{servicename}/{method}", method = RequestMethod.GET)
    public String helloConsumer(@PathVariable("servicename") String servicename
            , @PathVariable("method") String method) {
        return helloService.helloConsumer(servicename, method);
    }
}
