package com.Day1_11;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/11 20:02
 * @Description:不负自己
 */
public class F {
    public static void main(String[] args) {
//        将一个正整数分解成质因数，例如输入90，打印出90=2*3*3*5
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个人数");
        int x=sc.nextInt();
        System.out.print(x+"=");
        for(int i=2;i<x+1;i++){
            while (x%i==0&&x!=i){
                x=x/i;
                System.out.print(i+"*");
            }
            if(x==i){
                System.out.print(x);
                break;
            }
        }

    }
}
