package com.homework;

public class Demo12 {
    public static void main(String[] args){
//        一个数如果恰好等于它的因子之和，这个数就称为”完数”。
// 例如6=1＋2＋3.编程找出1000以内的所有完数

//        第一个循环是1-1000这内的数
        for(int x=2;x<1000;x++){
            int sum=0;
//            第二个循环找的是因子
            for(int y=1;y<x;y++){
//                在求因子
                if(x%y==0){
                    sum=sum+y;
                }

            }
            if(sum==x){
                System.out.println(x);
            }
        }
    }
}
