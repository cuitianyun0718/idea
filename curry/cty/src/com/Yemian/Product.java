package com.Yemian;


//这是一个商品类
public class Product {
//    商品属性
    public int id;
    public String pamee;
    public int prices;
   public String xq;


//    创建对象的一个方法
    public static Product getNew(int id ,String pamee,int prices,String xq ){

        Product p1 = new Product();
        p1.id=id;
        p1.pamee=pamee;
        p1.prices=prices;
        p1.xq=xq;
        return p1;

    }
//
}
