package com.Inclass;
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int x= sc.nextInt();
        System.out.println("请输入另一个数");
        int y =sc.nextInt();
        int c=sum(x,y);
        System.out.println("输出结果是"+c);
    }
    public static int sum(int x,int y){
       int c=x+y;
       return c;
    }
}
