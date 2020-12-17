package com.ctrip.arch.springboot.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjkai
 * @date 2020/12/17
 */
@FeignClient("service")
public interface HelloServiceApi {
    @RequestMapping("/hello")
    String hello();

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);
}
