package com.dousnl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author hanliang
 * @version 1.0
 * @date 2020/6/24 15:46
 */
@RestController
@RequestMapping("/jad")
public class JadController {

    private Logger logger=LoggerFactory.getLogger(JadController.class);

    @RequestMapping(value = "/id",method = RequestMethod.GET)
    public String findJad(String jad){
        int i = Integer.parseInt(jad);
        logger.info(">>>>>>>>>>>>>>>>>>>jad:"+i);
        return jad;
    }
}
