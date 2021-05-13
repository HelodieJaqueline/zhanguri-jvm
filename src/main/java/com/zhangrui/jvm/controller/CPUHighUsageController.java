package com.zhangrui.jvm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @description: CPU飙高
 * @author: ZhangRui
 * @create: 2021-05-12 16:31
 **/
@RestController
public class CPUHighUsageController {


    @GetMapping(value = "/cpuHighUsage")
    public long cpuHighUsage() {
        long count = 0;
        for (; ; ) {
            count++;
            if (count > 19999999999L) {
                break;
            }
        }
        return count;
    }

}