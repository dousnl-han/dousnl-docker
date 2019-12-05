package com.dousnl.fegin;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-user")
public interface UserClient {

    @RequestMapping("/list")
    public String getUser();
}
