package com.DuoXianCheng;

/**
 * @Author:cty
 * @Date:2019/1/29 18:24
 * @Description:不负自己
 */
public class Test2Demo {
    public static void main(String[] args) {
//        创建两个多线程的对象
        Test2 t1=new Test2();
        Test2 t2=new Test2();
//        run仅仅是封装被线程执行的代码
//        start首先启动了线程，然后再有jvm去调用该线程的run方法


        t1.start();
        t2.start();



    }
}
