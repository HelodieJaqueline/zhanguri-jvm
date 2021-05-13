package com.zhangrui.jvm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: CPU飙高
 * @author: ZhangRui
 * @create: 2021-05-12 16:31
 **/
@RestController
public class CPUHighUsageController {


    @GetMapping(value = "/cpuHighUsage")
    public long cpuHighUsage(Long limit) {
        long count = 0;
        do {
            count++;
        } while (count <= limit);
        return count;
    }

}