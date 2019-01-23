package com.homework;
//import java.util.Scanner;
public class Demo6 {
    public static void main(String[] agrs){
//        6、使用while循环求式子2+22+222+2222+22222的和。p=p*10+2;
        int x=2;
        int sum=0;
        while(x<22223){
            sum=sum+x;
            x=x*10+2;
        }
        System.out.println("和为"+sum);

    }
}
