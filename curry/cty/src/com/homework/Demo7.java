package com.homework;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] agrs) {
//        对任意的自然数，若是奇数，就对它乘以3加1；若是偶数就对它除以2
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个自然数");
//        int i=sc.nextInt();
//        do {
//            if (i % 2 == 1) {
//                i = i * 3 + 1;
//            } else {
//                i = i / 2;
//            }
//            System.out.print(i+",");
//
//        } while (i != 1);

        int x = sc.nextInt();
        while (true) {
            if (x % 2 == 1) {
                x = 3 * x + 1;
                System.out.println(x);

            } else {
                x = x / 2;
                System.out.println(x);
            }

        }
    }

}



