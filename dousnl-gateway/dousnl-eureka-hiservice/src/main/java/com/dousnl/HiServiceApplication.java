package com.dousnl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author hanliang
 * @version 1.0
 * @date 2019/9/25 14:58
 */
@RestController
@SpringBootApplication
@EnableEurekaClient
public class HiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiServiceApplication.class, args);
    }

    @RequestMapping("/say")
    public String sayHi(){
        return "say hi";
    }
}
