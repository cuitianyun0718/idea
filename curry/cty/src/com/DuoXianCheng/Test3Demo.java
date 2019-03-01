package com.DuoXianCheng;

/**
 * @Author:cty
 * @Date:2019/1/29 18:33
 * @Description:不负自己
 */
public class Test3Demo {
    public static void main(String[] args) {
//        带参构造方法给线程起名字
        Test3 t1=new Test3("崔天云");
        Test3 t2=new Test3("james");
        Test3 t3=new Test3("curry");
        t1.start();
        t2.start();
        t3.start();

//我想要获取main方法的所在的线程对象的名称
//        遇到这种情况，Thread类提供了一个很好的方法
//
        System.out.println(Thread.currentThread().getName());
    }
}
