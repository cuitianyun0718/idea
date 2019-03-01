package com.itdr.controller.qiantai;

import com.itdr.common.Pub;
import com.itdr.domain.Product;
import com.itdr.service.qiantai.ProductServices;
import com.itdr.service.qiantai.ProductServiceImp;

import java.util.ArrayList;

/**
 * @Author:cty
 * @Date:2019/1/30 21:43
 * @Description:不负自己
 */
public class ProductController {

    private ProductServices ps = new ProductServiceImp();

    //展示一个商品信息
    public Product showone(int pid) {
        Product pro = ps.showOne(pid);
        return pro;
    }


    //    展示所有商品信息
    public ArrayList<Product> showAll() {
        ArrayList<Product> li = ps.showAll();
        return li;

//    搜索商品
    }

    public Pub selectMore(String pname) {
        ArrayList<Product> li = ps.selectMore(pname);
        Pub p=Pub.success(li);
        return p;
    }

}
