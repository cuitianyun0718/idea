package com.day01;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        switch语句判断季节
        int x = sc.nextInt();

        switch (x) {
            case 11:
            case 12:
            case 1:
                System.out.println("冬季");
                break;

            case 2:
            case 3:
            case 4:
                System.out.println("春季");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("夏季");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("秋季");
                break;
            default:
                System.out.println("你输入的月份不合适");


        }
    }
}

