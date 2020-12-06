package com.ctrip.arch.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value="ribbon/{servicename}/{method}", method = RequestMethod.GET)
    public String helloConsumer(@PathVariable("servicename") String servicename
            , @PathVariable("method") String method) {
        return restTemplate.getForEntity("http://"+ servicename +"/" + method, String.class).getBody();
    }
}
