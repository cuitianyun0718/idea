package com.itdr.data;
import com.itdr.domain.Cart;

import java.util.ArrayList;

/**
 * @Author:cty
 * @Date:2019/2/19 18:21
 * @Description:不负自己
 */
public interface CartData {
    //获取所有的购物车信息
    ArrayList<Cart> selectAll();

    //获取该用户的所有购物信息
    ArrayList<Cart> selectAllByUname(String uname);

    boolean addOne(Cart c);
}
