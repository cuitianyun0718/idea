package com.xiaopu;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/18 19:00
 * @Description:不负自己
 */
public class Text {
//    这个是用来模拟注册的类
//    1首先应该先输入账号和密码，
//    2如果输入的账号在数据库里有就说明注册失败，如果没有就说明注册成功

    public static String arr1[] = new String[3];
    public static String arr2[] = new String[3];
    static int index = 0;
public static void main(String[] args) {
    Scanner scan1 = new Scanner(System.in);
    System.out.println("请输入用户名：");
    String str1 = scan1.next();
    Scanner scan2 = new Scanner(System.in);
    System.out.println("请输入密码：");
    String str2 = scan2.next();


    boolean flag = false;
    for (int i = 0; i < arr1.length; i++) {
        if (str1.equals(arr1[i])) {
            System.out.println("用户名已存在");
            flag = true;
        }
    }
    if (flag == false) {
        index++;
        if (index < arr1.length) {
            arr1[index] = str1;
            arr2[index] = str2;
            System.out.println("注册成功！");
        } else {
            add();
            arr1[index] = str1;
            arr2[index] = str2;
            System.out.println("注册成功！");

        }
    }
}

    private static void add() {
    }


}
