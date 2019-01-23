package com.Day02;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/12 10:35
 * @Description:不负自己
 */


//1,模拟一个用户登陆的过程
//   2，用户输入账号和密码
//    3点击注册按钮，这个注册信息就发到后台
//    4，后台拿到这个数据和后台对比，如果有重复的就告诉用户重新注册，否则就成功
//    5又回到第一步；
//    分析完毕之后
//    1，需要创建一个用户类
public class Demo1 {
    public static void main(String[] args) {

        //        初始化一个数据类型为数组（User）类型的数组，用来放user类的对象，它的长度是5，所以可以放5个对象
//NEW 一个数组
        User[] us = new User[3];
//        然后先创建一个对象，放到数组里
        User u1 = new User();
//        光创建对象还不行，还要给对象赋值啊，不然对象就是初始化值，没有意义啊
        u1.name = "cty";
        u1.password = "123";
//
//        我还想再创建一个对象，可以照着上面的这个在做一遍
        User u2 = new User();
//        然后给对象在赋值

        u2.name = "cc";
        u2.password = "456";
//上面这个对象赋值完毕，但也不能结束啊，还没有放在数组了保存起来
        us[0] = u1;
        us[1] = u2;

//        输入数据
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入账号");
//
            String u = sc.next();
            System.out.println("请输入密码");
            String p = sc.next();
//        调用方法
            Demo1.bd(us, u, p);
        }

    }
    //    写一个比对注册数据的方法
    public static void bd(User[] ssss, String ss, String sss) {

        //        这个方法需要一些东西，需要账号和密码去生成一个用户对象，
//需要一个数组来存放这个对象，而且这个数组是大家能够访问到的，。

        for (int a = 0; a < ssss.length; a++) {
            if (ssss[a] != null) {
                if (ssss[a].name.equals(ss)) {

                    System.out.println("你要注册的账号已经存在");
                    return;
                }
            }
        }

//        把账号和密码封装成一个User类的对象
        User u = new User();
        u.name =ss;
        u.password = sss;
        //把对象放到数组里
        for (int a = 0; a < ssss.length; a++) {
            if (ssss[a] == null) {
                ssss[a] = u;
                System.out.println("注册成功");
                return;
            }
            if (a == ssss.length - 1 && ssss[a] != null) {
                System.out.println("网站注册人数已经满了，谢谢注册");
                return;
            }
        }
    }
}



