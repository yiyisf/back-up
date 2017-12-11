package com.slys.start.start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MessageRestController {

    @RequestMapping("/hello")
    String getMessage(@RequestParam(value = "name", defaultValue = "默认") String name){
        String rsp = "Hi " + name + " : responsed on - " + new Date();
        System.out.println(rsp);
        return rsp;
    }
}
