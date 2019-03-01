package com.F50;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/28 15:41
 * @Description:不负自己
 */
public class Test5 {
//   利用条件运算符的嵌套类完成此题，学习成绩》=90的同学的成绩用A表示，
// 60-89分之间的用B表示，60分以下用c表示
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("请输入成绩");
    int x =sc.nextInt();

    if(x>=90&&x<100){
        System.out.println("学生的成绩是A");
    }
    if (x>60 && x<89){
        System.out.println("学生的成绩是B");
    }
    if (x<60&&x>0){
        System.out.println("学生的成绩C");
    }
    if (x>100||x<0){
        System.out.println("你输入的成绩无效");
    }
}

}
