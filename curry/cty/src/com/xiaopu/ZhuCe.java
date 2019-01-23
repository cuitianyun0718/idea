package com.xiaopu;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/19 10:22
 * @Description:不负自己
 */
public class ZhuCe {
    public static void main(String[] args) {

        String pro[][] = new String[4][2];
        pro[0][0] = "a";
        pro[0][1] = "1";
        pro[1][0] = "b";
        pro[1][1] = "2";
        pro[2][0] = "c";
        pro[2][1] = "3";

//        pro[2][1]="2";
//        pro[3][0]="c";
//        pro[3][1]="3";
//        pro[4][0]="4";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入注册账号");
            String x = sc.next();
            System.out.println("请输入注册密码");
            String y = sc.next();


            for (int i = 0; i < pro.length; i++) {
                if (x.equals(pro[i][0])) {
                    System.out.println("注册账户已经存在");
                    break;
                } else {
                    System.out.println("注册成功");
                    break;
                }
            }


        }
    }
}
