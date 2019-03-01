package com.DuoXianCheng;

/**
 * @Author:cty
 * @Date:2019/1/30 14:24
 * @Description:不负自己
 */
public class Test8Demo {
    public static void main(String[] args) {
//        String s=null;
//        System.out.println(s);
//        创建资源对象
        Test8 t=new Test8();
//        创建三个窗口
        Thread t1=new Thread(t,"第一");
        Thread t2=new Thread(t,"第二");
        Thread t3=new Thread(t,"第三");
//        启动线程
        t1.start();
        t2.start();
        t3.start();
    }

}
