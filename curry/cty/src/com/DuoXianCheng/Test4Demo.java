package com.DuoXianCheng;

import com.collection.Map.TreeMap.Test;

/**
 * @Author:cty
 * @Date:2019/1/29 18:43
 * @Description:不负自己
 */
public class Test4Demo {

//    当正在运行的线程是守护线程时，java虚拟机退出，该方法必须在启动线程前调用

    public static void main(String[] args) {
//        创建两个Test的对象
        Test4 t1=new Test4();
        Test4 t2=new Test4();
        Test4 t3=new Test4();
        t1.setName("关羽");
        t2.setName("张飞");
        t3.setName("马超");
//        设置收获线程


//        t1.setDaemon(true);
//        t2.setDaemon(true);
//        t3.setDaemon(true);
        t1.setPriority(1);
        t3.setPriority(8);//优先级越高，越先出现

        t1.start();

        t2.start();

        t3.start();


//        Thread.currentThread().setName("刘备");
//        for (int x=0;x<10;x++){
//            System.out.println(Thread.currentThread().getName()+":"+x);
//        }
    }
}
