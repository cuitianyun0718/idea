package com.itdr.service.qiantai;

import com.itdr.common.Pub;

/**
 * @Author:cty
 * @Date:2019/2/19 18:26
 * @Description:不负自己
 */
public interface CartService {
    //把一个商品加入购物车
    Pub addProduct(String uname, int pid, int pum);
}
