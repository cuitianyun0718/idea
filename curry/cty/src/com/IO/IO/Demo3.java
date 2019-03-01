package com.IO.IO;

/**
 * @Author:cty
 * @Date:2019/1/29 15:03
 * @Description:不负自己
 */
public class Demo3 {
    public static void main(String[] args) {

//创建资源对象
        Sell s=new Sell();
//        创建三个线程对象
        Thread t1=new Thread(s,"窗口1");
        Thread t2=new Thread(s,"窗口2");
        Thread t3=new Thread(s,"窗口3");
//        启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
