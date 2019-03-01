package com.DuoXianCheng;

/**
 * @Author:cty
 * @Date:2019/1/30 13:54
 * @Description:不负自己
 */
public class Test7Demo {
//    实现Runnable接口的方式实现
    public static void main(String[] args) {
//        创建资源对象
        Test7 t=new Test7();

//        创建三个线程对象
        Thread t1=new Thread(t,"窗口1");
        Thread t2=new Thread(t,"窗口2");
        Thread t3=new Thread(t,"窗口3");
//        启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
