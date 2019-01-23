package com.day01;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
//        if语句的使用，成绩的测试

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 90 && x <= 100) {
            System.out.println("优秀");
        }
        else if (x >= 80 && x < 90)
        {
            System.out.println("好");
        }
        else if (x>=70 && x<80){
            System.out.println("良好");
        }
        else if(x>=60 && x<70){
            System.out.println("及格");
        }
        else if(x<60 && x>0){
            System.out.println("不及格");
        }
        else{
            System.out.println("您数额的成绩不对");
        }
    }
}
