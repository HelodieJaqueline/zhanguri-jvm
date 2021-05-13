package com.zhangrui.jvm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @description: 接口响应慢
 * @author: ZhangRui
 * @create: 2021-05-09 21:19
 **/
@RestController
@Slf4j
public class SlowController {

    @GetMapping(value = "/slow")
    public Long slow(Long id) throws InterruptedException {
        log.info("接口响应慢！！！！");
        slowMethod();
        return id;
    }

    private void slowMethod() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
    }
}
