package com.Yemian;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] agrs) {
//       用户登录，需要输入账号密码
        Scanner sc = new Scanner(System.in);
        int count = 0;
        wk:
        while (true) {
            while (count < 3) {
                System.out.println("请输入账号");
//                接受String类型的账号
                String name = sc.next();
                System.out.println("请输入密码");
                //    接受密码（用一个简单的密码）
                int password = sc.nextInt();
//                模拟在数据库中创建一个账户
                String unname = "cty";
                int upasswoed = 950718;
//                判断用户是否存在
                if (name.equals(unname) && password == upasswoed) {
                    System.out.println("登录成功");
                    break wk;
                } else {
                    System.out.println("密码或账号错误，请查证后重新输入");
//                    每次登录失败后，count增加一次；
                    count++;
                }

            }
            if (count == 3) {
                System.out.println("输入次数过多，请重新输入");
//                只有在锁定的情况下，才需要解锁，可以用回答问题来解决
                while (count != 0) {
                    String phone = "17793152117";
                    int haoma = 950718;
                    System.out.println("请输入手机号验证");
                    String uphone=sc.next();
                    System.out.println("请输入验证码");
                    int uhaoma=sc.nextInt();

                    if (uphone.equals(phone)&& haoma==uhaoma) {
                        count = 0;
                        System.out.println("已经结锁");
                        System.out.println("新的密码已经重新发送到了你的手机上，请记得查收");
                    } else {
                        System.out.println("您输入的验证码有误，请查证后重新输入");
                    }
                }

            }
        }


    }
}
