package com.homework;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
//  3、要求用户输入一个年份和一个月份，判断（要求使用嵌套的if…else和switch分别判断一次）该年该月有多少天。
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个月份");
        int j = sc.nextInt();
        System.out.println("请输入一个年份");
        int i = sc.nextInt();



        if((i%4==0&&i%100!=0)||(i%400==0)){
            if(j==2){
                System.out.println(i+"年"+j+"月有29天！");
            }else if(j==1||j==3||j==5||j==7||j==8||j==10||j==12){
                System.out.println(i+"年"+j+"月有30天！");
            }else{
                System.out.println(i+"年"+j+"月有31天！");
            }

        }else {
            if (j == 2) {
                System.out.println(i + "年" + j + "月有28天！");
            } else if (j==1||j==3||j==5||j==7||j==8||j==10||j==12) {
                System.out.println(i + "年" + j + "月有30天！");
            } else {
                System.out.println(i + "年" + j + "月有31天！");
            }

        }
//第二种办法
        System.out.println("请输入一个月份");
        int x = sc.nextInt();//月
        System.out.println("请输入一个年份");
        System.out.println();
        int y =sc.nextInt();//年
        switch(x){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(y+"年"+x+"月有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(y+"年"+x+"月有30天");
                break;
            case 2:
                if(y%4==0 && y%100!=0 ||y%400==0){
                System.out.println(y+"年"+x+"月有29天");

            }
            else{
                System.out.println(y+"年"+x+"月有28天");
                break;
            }

                dafault:
                System.out.println("输入错误");
                break;
        }


    }


}
