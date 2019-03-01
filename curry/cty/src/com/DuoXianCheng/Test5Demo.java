package com.DuoXianCheng;

/**
 * @Author:cty
 * @Date:2019/1/29 18:58
 * @Description:不负自己
 */
public class Test5Demo {
//    public final void join():等待线程终止

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5();
        Test5 t3 = new Test5();
        t1.setName("中国");
        t2.setName("美国");
        t3.setName("日本");


        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();//这个的意思就是让t1运行完其他的才可以继续运行

        }
        t2.start();
        t3.start();
        Thread.currentThread().setName("英国");
        for (int x = 1; x < 100; x++) {
            System.out.println(Thread.currentThread().getName()+x);
        }
    }
}
