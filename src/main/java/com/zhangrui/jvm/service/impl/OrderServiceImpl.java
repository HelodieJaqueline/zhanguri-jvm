package com.zhangrui.jvm.service.impl;

import com.zhangrui.jvm.service.OrderService;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: ZhangRui
 * @create: 2021-05-13 17:53
 **/
@Service
public class OrderServiceImpl implements OrderService {


    @Override
    public Long slow(Long id) throws InterruptedException {
        //模拟接口响应慢
        TimeUnit.SECONDS.sleep(RandomUtils.nextInt(1, 3));
        return id;
    }
}
