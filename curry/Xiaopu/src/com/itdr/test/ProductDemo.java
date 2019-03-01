package com.itdr.test;

import com.itdr.common.Pub;
import com.itdr.controller.qiantai.ProductController;
import com.itdr.domain.Product;

import java.util.*;

/**
 * @Author:cty
 * @Date:2019/1/30 22:21
 * @Description:不负自己
 */
public class ProductDemo {
    private static ProductController pc = new ProductController();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //      查询所有商品
        System.out.println(pc.showAll());


        //   查询一个商品
        System.out.println(pc.showone(sc.nextInt()));

        //   模糊搜索商品

        Pub p = pc.selectMore(sc.next());
        if(p.getTock() == Pub.SUCCESS_CODE){
            ArrayList<Product> li = (ArrayList<Product>) p.getT();
            for (Product product : li) {
                System.out.println("数据："+product);
                System.out.println("状态码："+p.getTock());
            }
        }

        if(p.getTock() == Pub.FAIL_CODE ){
            String s  = (String) p.getT();
            System.out.println("数据："+s);
            System.out.println("状态码："+p.getTock());
        }





    }
}
