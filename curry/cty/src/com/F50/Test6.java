package com.F50;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/28 15:51
 * @Description:不负自己
 */
public class Test6 {
//    输入两个正整数m和n，求其最大公约数和最小公倍数
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个数");
    int m = sc.nextInt();
    System.out.println("请输入另一个数");
    int n = sc.nextInt();
    max_min(m,n);

}
    public static void max_min(int m, int n) {

        int temp = 1;
        int yshu = 1;
        int bshu = m*n;
        if(n<m){
            temp = n;
            n = m;
            m = temp;
        }
        while(m!=0){
            temp = n%m;
            n = m;
            m = temp;
        }
        yshu = n;
        bshu /= n;
        System.out.println("最大公约数为"+yshu);
        System.out.println("最小公倍数为"+bshu);
    }

}
