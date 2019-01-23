package com.Yemian;

import java.util.Scanner;

public class Hero {

    public static void main(String[] args) {
//        创建一个英雄
        Product p1 = new Product();
        p1.id = 1;
        p1.pamee = "孙悟空";
        p1.prices = 13888;
        p1.xq = "好";
        System.out.print("产品ID是：" + p1.id);
        System.out.print("产品类型是：" + p1.pamee);
        System.out.print("产品价格是：" + p1.prices);
        System.out.println("产品价格是：" + p1.xq);
//        System.out.println("--------------------------");

        Product p2 = Product.getNew(2, "诸葛亮", 13888, "好");
//
//        System.out.print("产品ID是：" + p2.id);
//        System.out.print("产品类型是：" + p2.pamee);
//        System.out.print("产品价格是：" + p2.prices);
//        System.out.println("产品描述是：" + p2.xq);

        Product p3 = Product.getNew(3, "貂蝉", 13888, "好");
//        System.out.print("产品ID是：" + p3.id);
//        System.out.print("产品类型是：" + p3.pamee);
//        System.out.print("产品价格是：" + p3.prices);
//        System.out.println("产品描述是：" + p3.xq);
        Product p4 = Product.getNew(4, "鲁班", 888, "好");
//        System.out.print("产品ID是：" + p4.id);
//        System.out.print("产品类型是：" + p4.pamee);
//        System.out.print("产品价格是：" + p4.prices);
//        System.out.println("产品描述是：" + p4.xq);



    }
}

