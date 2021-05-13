package com.zhangrui.jvm.service;

import org.springframework.stereotype.Service;

/**
 * @description: 用户服务
 * @author: ZhangRui
 * @create: 2021-05-13 17:40
 **/
public interface UserService {

    Long slow(Long id) throws InterruptedException;

}
