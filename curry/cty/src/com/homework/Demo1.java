package com.homework;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] agrs) {
//        要求；1、要求用户输入一个年份，判断并输出该年份是闰年还是平年。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int x = sc.nextInt();
        if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
            System.out.println("该年份是闰年");
        } else {
            System.out.println("该年份是平年");
        }


    }
}
