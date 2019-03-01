package com.DuoXianCheng;

import java.security.PrivateKey;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author:cty
 * @Date:2019/1/30 14:16
 * @Description:不负自己
 */
public class Test8 implements Runnable {
    //    定义票
    private int t = 100;
    //    定义锁对象
    private Lock l = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            try {
//            加锁
                l.lock();
                if (t > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (t--) + "张票");
                }
            } finally {
                l.unlock();//释放锁
            }

        }
    }

}

