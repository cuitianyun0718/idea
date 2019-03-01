package com.itdr.data;

import com.itdr.domain.Cart;
import com.itdr.domain.Order;
import com.itdr.domain.Product;
import com.itdr.domain.User;

import java.io.File;
import java.util.ArrayList;

/**
 * @Author:cty
 * @Date:2019/1/30 18:13
 * @Description:不负自己
 */
public interface CommonData {
//    用户数据库
    User [] getUserDataSZ();
    ArrayList<User> getUserDataJH();
    File getUserDataF();

//  这是泛型的应用，不太好用，所以先放着

//    public <T> T get(T t);
//    商品数据库
Product[] getProductDataSZ();
    ArrayList<Product> getProductDataJH();
    File getProductDataF();



//    购物车数据库
Cart[] getCartDataSZ();
    ArrayList<Cart> getCartDataJH();
    File getCartDataF();
//    订单数据库
Order[] getOrderDataSZ();
    ArrayList<Order> getOrderDataJH();
    File getOrderDataF();
    //xx数据库
}
