package com.dousnl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author hanliang
 * @version 1.0
 * @date 2019/12/4 15:59
 */
@RestController
public class UserController {



    @RequestMapping("/list")
    public String getUser(){
        return "用户信息........";
    }
}
