package com.ctrip.arch.springboot.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjkai
 * @date 2020/12/17
 */
@RestController
public class ConsumerController {
    @Autowired
    private HelloServiceApi helloServiceApi;

    @RequestMapping(value = "/feign/consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloServiceApi.hello();
    }
}
