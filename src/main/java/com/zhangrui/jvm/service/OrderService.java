package com.zhangrui.jvm.service;

/**
 * @description: 订单服务
 * @author: ZhangRui
 * @create: 2021-05-13 17:53
 **/
public interface OrderService {

    Long slow(Long id) throws InterruptedException;
}
