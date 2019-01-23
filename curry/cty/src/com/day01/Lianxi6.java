package com.day01;
import java.util.Scanner;
public class Lianxi6 {
    public static void main(String[] args){
//        调用方法的加，减，乘，除
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int x=sc.nextInt();
        System.out.println("请输入一个数");
        int y=sc.nextInt();
        int c= sum(x,y);

        System.out.println("输出结果是"+c);

    }
    public static int sum(int a, int b){
        int c =a*b;
        return c;
    }



}
