package com.Yemian;
//这个类是我们用来测试我的每个模拟功能的

import com.Hero.Hero;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Xptext {
    //    需要进行初始化的一些东西
//    存储用户数据的数组
    public static void main(String[] args) {
//        String[][] account = new String[3][3];
//
////键盘录入功能

        Scanner sc = new Scanner(System.in);
        System.out.println("商家即将开始录入商品");

//      初始化货架
        Product[] pro = new Product[4];
        //获取新英雄的过程
        for (int a = 0; a < pro.length; a++) {

            System.out.println("英雄ID是啥");
            int id = sc.nextInt();
            System.out.println("英雄名字是啥");
            String pamee = sc.next();
            System.out.println("英雄价格是啥");
            int prisce = sc.nextInt();
            System.out.println("英雄描述咋样");
            String xq = sc.next();
            Product p = Product.getNew(id, pamee, prisce, xq);
//           把英雄上架
            pro[a] = p;
//
//            break;

        }

        System.out.println("商品录入完成");
//      程序主入口

        while (true) {
            DB.welcome();


            int xz = sc.nextInt();
//            要登录的过程
            if (xz == 1) {
//        这是个登录过程，我调用的是Demo1里面的main方法
                Demo1.main(args);
            }
            if (xz == 2) {
//                接受账户和密码
                Zhuce1.main(args);
            }

            if (xz == 3) {
//                查看店铺商品
                w1:
                while (true) {
                    for (int a = 0; a < pro.length; a++) {
                        System.out.print("商品id是：" + pro[a].id);
                        System.out.print("商品名称是：" + pro[a].pamee);
                        System.out.print("商品价格：" + pro[a].prices);
                        System.out.println("商品描述：" + pro[a].xq);


                    }
                    System.out.println("商品已经查看结束，继续请按1.退出请按0");
                    int x1 = sc.nextInt();
                    if (x1 == 1) {
                        break w1;
                    }
                    if (x1 == 0) {
                        return;

                    }
                }

            }
            if (xz == 4) {
//                管理员入口
                DB.main(args);
            }
            if (xz == 5) {
//                离开店铺
                System.out.println("欢迎再来！");
                return;
            }
        }
    }
}



