package com.F50;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/27 22:11
 * @Description:不负自己
 */
public class Test4 {
//   将一个正整数分解质因数。例如，输入，90，打印出90=2*3*3*5
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入一个数");
    int x=sc.nextInt();
    System.out.print(x+"=");
    for (int i=2;i<x+1;i++){
        if (x%i==0&&x!=i){
            x=x/i;
            System.out.print(i+"*");
        }
        if (x==i){
            System.out.println(i);
        }
    }
}

}
