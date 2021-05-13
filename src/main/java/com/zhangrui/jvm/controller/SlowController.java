package com.zhangrui.jvm.controller;

import com.zhangrui.jvm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @description: 接口响应慢
 * @author: ZhangRui
 * @create: 2021-05-09 21:19
 **/
@RestController
public class SlowController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/slow")
    public Long slow(Long id) throws InterruptedException {
        return userService.slow(id);
    }

}
