package com.IO.IO;

/**
 * @Author:cty
 * @Date:2019/1/29 15:07
 * @Description:不负自己
 */
public class Sell implements Runnable {
    private int tic=100;
    @Override
    public void run() {
        while (true){
            if(tic>0){

            System.out.println(Thread.currentThread()
                    .getName()+"正在出售"+(tic--)+"张票");

            }
        }
    }
}
