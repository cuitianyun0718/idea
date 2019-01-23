package com.Day1_11;

public class Demo1 {
    public static void main(String[] args) {
        //判断101-200之间有多少个素数，并且输出所有素数之和
        int sum = 0;
        for (int x = 101; x < 200; x++) {
            boolean i = true;
            for (int j = 2; j <x; j++) {
                if (x % j == 0) {
                    i = false;
                    break;
                }
            }

            if (i==true) {
                System.out.println("素数分别是" + x);

            }
        }

    }




















}




