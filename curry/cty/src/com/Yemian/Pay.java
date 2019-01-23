package com.Yemian;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/19 15:25
 * @Description:不负自己
 */
//选购商品，
//    将选购的商品放入购物车
//    然后就是付款
public class Pay {
    public static void main(String[] args) {
//        用数组模拟购物车
//        Scanner sc=new Scanner(System.in);
        System.out.println("欢迎来到英雄店铺");
        System.out.println("请开始选择你的英雄");
        System.out.println("请在看一遍我们店铺的东西");
        System.out.println("请输入要选择的产品id");

//        int x=sc.nextInt();
        System.out.println("请输入需要数量");
//        int y=sc.nextInt();

        System.out.println("您本次消费");

//模拟一个用户
        User u=new User();
        u.setName("cty");
//        模拟一个商品数组
        int a[][]=new int[3][2];
        a[0][0]=2;
        a[1][0]=3;
        a[2][0]=4;


//模拟放到购物车里
        ShopCar sc=new ShopCar();
         sc.setU(u);
         sc.setA(a);
    }
}
