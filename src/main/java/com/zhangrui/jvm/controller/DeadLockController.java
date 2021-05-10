package com.zhangrui.jvm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 死锁
 * @author: ZhangRui
 * @create: 2021-05-10 16:08
 **/
@RestController
public class DeadLockController {


    @GetMapping("/deadLock")
    public void deadLock() {
        DeadLock d1=new DeadLock(true);
        DeadLock d2=new DeadLock(false);
        Thread t1=new Thread(d1);
        Thread t2=new Thread(d2);
        t1.start();
        t2.start();
    }


    //定义锁对象
    static class MyLock{
        public static Object obj1=new Object();
        public static Object obj2=new Object();
    }
    //死锁代码
    static class DeadLock implements Runnable {
        private boolean flag;

        DeadLock(boolean flag) {
            this.flag = flag;
        }

        @Override
        public void run() {
            if (flag) {
                while (true) {
                    synchronized (MyLock.obj1) {
                        System.out.println(Thread.currentThread().getName() + "----if获得obj1锁");
                        synchronized (MyLock.obj2) {
                            System.out.println(Thread.currentThread().getName() + "----if获得obj2锁");
                        }
                    }
                }
            } else {
                while (true) {
                    synchronized (MyLock.obj2) {
                        System.out.println(Thread.currentThread().getName() + "----否则获得obj2锁");
                        synchronized (MyLock.obj1) {
                            System.out.println(Thread.currentThread().getName() + "----否则获得obj1锁");

                        }
                    }
                }
            }
        }
    }
}

