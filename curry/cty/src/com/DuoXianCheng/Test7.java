package com.DuoXianCheng;

/**
 * @Author:cty
 * @Date:2019/1/30 13:51
 * @Description:不负自己
 */
public class Test7 implements Runnable {
//    定义100张票
    int t=100;
    @Override
    public void run() {
        while(true){
            if (t>0){
                System.out.println(Thread.currentThread().getName()+"正在出售第"+(t--)+"张票");
            }
        }
    }
}
