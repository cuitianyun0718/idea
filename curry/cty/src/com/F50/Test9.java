package com.F50;

/**
 * @Author:cty
 * @Date:2019/1/29 8:43
 * @Description:不负自己
 */
public class Test9 {
//    题目，一个数恰好登于它的因子之和，这个数称为完数，例如6+1+2+3，编程找出1000以内的所有完数
public static void main(String[] args) {
//第一个人循环是遍历这个数
    for (int x=2;x<1000;x++){
        int sum=0;
//        第二个循环是找因子
        for (int i=1;i<x;i++){
            if(x%i==0){
                sum=sum+i;
            }
        }
        if (sum==x){
            System.out.println(x);
        }
    }
}
}
