package com.Day1_11;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/12 9:15
 * @Description:不负自己
 */
public class Demo2 {
    //    将一个正整数分解质因数，例如，输入90.打印出90=2*3*5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int n = sc.nextInt();
        System.out.print(n + "=");
        for (int i = 2; i < n + 1; i++) {
            if (n % i == 0 && n != i) {
                n=n/i;
                System.out.print(i+"*");

            }
            if(n==i){
                System.out.print(n);
                break;

            }
        }
    }
}

