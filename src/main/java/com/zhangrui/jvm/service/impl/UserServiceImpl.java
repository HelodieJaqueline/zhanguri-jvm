package com.zhangrui.jvm.service.impl;

import com.zhangrui.jvm.service.OrderService;
import com.zhangrui.jvm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: ZhangRui
 * @create: 2021-05-13 17:41
 **/
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private OrderService orderService;


    @Override
    public Long slow(Long id) throws InterruptedException {
        log.info("接口响应慢！！！！");
        TimeUnit.MILLISECONDS.sleep(RandomUtils.nextInt(300, 600));
        return orderService.slow(id);
    }

}
