package com.ctrip.arch.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by 金凯 on 2017/3/18.
 */
@SpringBootApplication(scanBasePackages={"com.ctrip"})
@EnableScheduling
@EnableWebMvc
@EnableEurekaServer
public class ServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class, args);
    }
}
