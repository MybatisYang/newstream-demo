package com.ht.newstreamdemo.controller;

import com.ht.newstreamdemo.provider.Producter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: test
 * @Author: yjs
 * @createTime: 2022年07月01日 17:46:57
 * @version: 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    Producter producter;

    @RequestMapping("/test")
    public void test(String message){

        producter.sendMessage(message);
    }
}
