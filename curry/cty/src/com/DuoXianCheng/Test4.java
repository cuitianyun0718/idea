package com.DuoXianCheng;

/**
 * @Author:cty
 * @Date:2019/1/29 18:41
 * @Description:不负自己
 */
public class Test4 extends Thread{
    @Override
    public void run() {
        for (int x=0;x<100;x++){
            System.out.println(getName()+x);
        }
    }
}
