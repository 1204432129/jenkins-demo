package com.vj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yuan_jian
 * @Date 2022/8/23 16:22
 * @Description TestController
 * @Version 1.0
 */
@RestController
public class TestController {

    @RequestMapping("test")
    public String api(){
        return "success";
    }
}
