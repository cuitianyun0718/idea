package com.homework;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/13 19:35
 * @Description:不负自己
 */
public class Demo15 {
//    需求：求出5的阶乘
//    高级版：由键盘录入一个数，然后求它的阶乘
public static void main(String[] args) {

    int sum=1;
    for ( int x=2;x<10;x++){
        sum=x*sum;
    }
    System.out.println(sum);
}
}
