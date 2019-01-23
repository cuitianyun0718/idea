package com.Yemian;


import java.util.Scanner;

//    这个类是用来放旁白对话的
public class DB {

public static void welcome(){
    System.out.println("欢迎来到开心王者荣耀");
    System.out.println("敌军还有三秒到达战场");
    System.out.println("请做好战斗准备");
    System.out.println("请输入功能编号选择功能");
    System.out.println("1,登录");
    System.out.println("2,注册");
    System.out.println("3,查看英雄");
    System.out.println("4，管理员登录");
    System.out.println("5,退出店铺");

//    System.out.println("4,");


}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("管理员请先登录");
            String name = "cty";
            String password = "2117";
            System.out.println("请输入账号");
            String x = sc.next();
            System.out.println("请输入密码");
            String y = sc.next();
            if (x.equals(name) && y.equals(password)) {
                System.out.println("登录成功");
            break ;
            } else if (x != name || y != password) {
                System.out.println("账号或者密码错误");

            }
        }
    }
}
