package com.day01;
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args){
//        求两个数的和

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");

        int x=sc.nextInt();

        System.out.println("请输入第二个数");
        int y=sc.nextInt();
        System.out.println("输出的第一个数是："+x);
        System.out.println("输出的第二个数是"+y);
        System.out.println("输出的两个数和是"+(x+y));

    }
}
