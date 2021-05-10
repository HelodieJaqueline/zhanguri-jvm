package com.zhangrui.jvm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 栈溢出
 * @author: ZhangRui
 * @create: 2021-05-10 18:05
 **/
@RestController
public class StackOverFlowController {

    @GetMapping(value = "/stackOverFlow")
    public void stackOverFlow() {
        long count = 0;
        method(count);
    }

    private void method(long count) {
        count++;
        System.out.println(count);
        method(count);
    }
}
