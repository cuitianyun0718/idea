package com.itdr.data;

import com.itdr.domain.Product;

import java.util.ArrayList;

/**
 * @Author:cty
 * @Date:2019/1/30 22:03
 * @Description:不负自己
 */
public class ProductDataImp implements ProductData {

    private Product[] p = new CommonDataImp().getProductDataSZ();

    @Override
    public ArrayList<Product> selecAll() {
        ArrayList<Product> li = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {

            li.add(p[i]);

        }
        return li;
    }

    @Override
    public Product selctOne(int pid) {
        for (Product product : p) {
//            这里用了增强for会出现空指针异常的问题，所以在这里进行判断
            if (product != null) {
                if (pid == product.getId()) {
                    return product;
                }
            }
        }
        return null;
    }


    @Override
    public ArrayList<Product> selectMore(String pname) {
        ArrayList<Product> li = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                if (p[i].getPname().contains(pname)) {
                    li.add(p[i]);
                }
            }
        }
        return li;
    }
}


