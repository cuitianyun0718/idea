package com.DuoXianCheng;

/**
 * @Author:cty
 * @Date:2019/1/29 18:20
 * @Description:不负自己
 */
public class Test2 extends Thread{

//    该类要重写run（）方法

    @Override
    public void run() {
        for (int x=1;x<100;x++){
            System.out.println(x);
        }
    }
}
