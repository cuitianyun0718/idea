package com.homework;
//import java.util.Scanner;
public class Demo5 {
    public static void main(String[] agrs){
//        5、使用while循环求1~100以内所有奇数的和。
        int x=1;
        int sum=0;
        while(x<100){
            sum=sum+x;
            x=x+2;
        }
        System.out.println("1-100所有奇数为"+sum);

    }
}
