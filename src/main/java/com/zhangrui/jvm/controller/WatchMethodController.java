package com.zhangrui.jvm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 监控方法出入参
 * @author: ZhangRui
 * @create: 2021-05-13 15:15
 **/
@RestController
@Slf4j
public class WatchMethodController {


    @GetMapping("/watch")
    public Map<Integer,Object> watch(Integer count) {
        Map<Integer,Object> result = new HashMap<>();
        if (null == count) {
            return result;
        }
        String value = methodA(count);
        value = methodB(value);
        value = methodC(value);
        result.put(count, value);
        return result;
    }

    private String methodA(Integer i) {
        String result = i + "A";
        log.info("methodA result :{}", result);
        return result;
    }

    private String methodB(String i) {
        return i + "B";
    }

    private String methodC(String i) {
        return i + "C";
    }


}
