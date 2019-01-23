package com.homework;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
//        2、要求 :用户输入两个整数，判断第一个整数是否是第二个整数的倍数。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int x = sc.nextInt();
        System.out.println("请输入第二个整数");
        int y = sc.nextInt();
        if(x%y==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }


    }
}
