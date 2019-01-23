package com.homework;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] Args) {
        //4、要求用户输入一个学生的分数（1~100），使用switch结构判断该分数属于什么等级（A、B、C、D、F）。
        Scanner sc = new Scanner(System.in);
        System.out.println("  请输入一个数");
        int x = sc.nextInt();

        switch (x/10) {
            case 0:
                System.out.println("该学生的成绩等级是F");
                break;

            case 1:
                System.out.println("该学生的成绩等级是F");
                break;
            case 2:
                System.out.println("该学生的成绩等级是F");
                break;
            case 3:
                System.out.println("该学生的成绩等级是D");
                break;
            case 4:
                System.out.println("该学生的成绩等级是D");
                break;
            case 5:
                System.out.println("该学生的成绩等级是C");
                break;
            case 6:
                System.out.println("该学生的成绩等级是C");
                break;
            case 7:
                System.out.println("该学生的成绩等级是B");
                break;
            case 8:
                System.out.println("该学生的成绩等级是B");
                break;
            case 9:
                System.out.println("该学生的成绩等级是A");
                break;
            case 10:
                System.out.println("该学生的成绩等级是A");
                break;
            default:
                System.out.println("成绩无效");

        }
    }
}
