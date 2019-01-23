package com.Day02;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/12 15:07
 * @Description:不负自己
 */
//这是一个模拟用户登录过程的程序
//    1，首先用户输入账号和密码
//    2，点击注册按钮，然后后台就收这个数据
//    3和后台去比较，如果有重复的则表明注册不成功。需要重新注册，反之则表明注册成功
//    分许完毕，首先创建一个用户类
public class Demo2 {
    public static void main(String[] args) {
//        初始化一个数据类型为数组（User）的数组，用来放用户User类的对象，它的长度是3，可以放三个对象
        User[] US = new User[3];
//        先创建一个对象
        User U1 = new User();

        U1.name = "CTY";
        U1.password = "123";
//        创建完对象还有给对象赋值
        US[1] = U1;

//    这儿就开始注册了就开始输入数据了
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入账号");
            String n = sc.next();
            System.out.println("请输入密码");
            String p = sc.next();
//        调用这个方法
            Demo2.bd(US, n, p);

        }
    }

    //    这个要写一个比对用户注册数据的方法
    public static void bd(User[] sss, String s, String ss) {

        for (int a = 0; a < sss.length; a++) {
            if (sss[a] != null) {
                if (sss[a].name.equals(s)) {
                    System.out.println("您注册的账号已经存在");
                    return;
                }
            }
        }
//        把账号和密码封装成一个User类的对象
        User u = new User();
        u.name = s;
        u.password = ss;
        for (int a = 0; a < sss.length; a++) {
            if (sss[a] == null) {
                sss[a] = u;
                System.out.println("注册成功");
                return;

            }
            if (a == sss.length - 1 && sss[a] != null) {
                System.out.println("网站已经超载了，不能注册了");
                return;
            }
        }

    }
}

