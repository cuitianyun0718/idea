package com.itdr.controller.qiantai;

import com.itdr.common.Pub;
import com.itdr.service.qiantai.CartService;
import com.itdr.service.qiantai.CartServiceImp;

/**
 * @Author:cty
 * @Date:2019/2/19 18:16
 * @Description:不负自己
 */
public class CartController {
    private CartService cs = new CartServiceImp();

    //购物车可能出现的请求

    //把一个商品加入购物车,这里需要的参数比较多，用户的账号、商品的ID、以及购买的数量
    public Pub addProduct(String uname, int pid, int pum){
        Pub p = cs.addProduct(uname,pid,pum);
        return p;
    }

    //查看购物车

}
