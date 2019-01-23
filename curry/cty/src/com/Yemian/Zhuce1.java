package com.Yemian;

import java.util.Scanner;

/*1.输入账号密码
 * 2.验证账号是否存在
 * 3.如果存在，就注册失败
 * 4.如果不存在，就注册成功
 * 5.如果成功即跳转登录页面*/
public class Zhuce1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xz = 1;
//        仓库数组初始化
        String[][] account = new String[3][2];
        account[0][0] = "cty";
        account[0][1] = "123";
        account[1][0] = "ccc";
        account[1][1] = "456";
        String name;
        String password ;
//          接收注册账号密码
        while (true) {
            bj1:
            while (true) {
                if (xz == 1) {
                    System.out.println("请输入您要注册的账号名");
                    name = sc.next();
                    System.out.println("请输入您的密码");
                    password = sc.next();
//        用户输入账号与仓库数组信息对比
                    bj2:
                    while (true) {
                        for (int m = 0; m < account.length; m++) {
                            if (name.equals(account[m][0])) {
                                System.out.println("账户名已存在，重新注册请选择1，退出注册请选择0");
                                xz = sc.nextInt();
                                if (xz == 0) {
                                    return;
                                }
                                if (xz == 1) {
                                    break bj2;
                                }
                            }
                        }
                        break bj1;
                    }
                }
            }

            int flag = 0;
            for (int m = 0; m < account.length; m++) {
                if (account[m][0] == null) {
                    account[m][0] = name;
                    account[m][1] = password;
                    flag = 0;
                    break;
                }
                if (m == account.length - 1 && account[m][0] != null) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("账户注册成功，即将回到主界面或者跳入登录页面");
                return;
            }
        }
    }
}

