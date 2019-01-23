package com.homework;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/13 20:25
 * @Description:不负自己
 */
public class Demo19 {
//   将一个正整数分解质因数，例如输入90，输出90=2*3*3*5
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    System.out.print(x+"=");
    for(int i=2;i<x+1;i++){
        if(x%i==0&&x!=i){
            x=x/i;
            System.out.print(i+"*");
        }
        if(x==i){
            System.out.println(x);
            break;
        }

    }

}
}
