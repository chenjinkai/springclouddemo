package com.ctrip.arch.springboot.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String helloConsumer(String servicename, String method) {
        return restTemplate.getForEntity("http://" + servicename + "/" + method, String.class).getBody();
    }

    public String helloFallBack(String arg1, String arg2) {
        return "error";
    }
}
