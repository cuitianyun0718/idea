package com.DuoXianCheng;

import java.util.Date;

/**
 * @Author:cty
 * @Date:2019/1/29 18:56
 * @Description:不负自己
 */
public class Test5 extends Thread{
    @Override
    public void run() {
        for (int x=0;x<100;x++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+":"+x+"日期"+new Date());
        }
    }
}
