package com.day01;
//import java.util.Scanner;
public class Lianxi5 {
    public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("请输入账号");
//     String name = sc.next();
//        System.out.println("请输入密码");
//        接受密码
        int count =0;
        int start =1;
        int end =884800;
        while(start<end){
            count++;
            start=start*2;
//            System.out.println();
        }
        System.out.println(count);
    }
}
