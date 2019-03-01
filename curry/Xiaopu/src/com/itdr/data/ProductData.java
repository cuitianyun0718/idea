package com.itdr.data;

import com.itdr.domain.Product;

import java.util.ArrayList;

/**
 * @Author:cty
 * @Date:2019/1/30 22:03
 * @Description:不负自己
 */
public interface ProductData {
    ArrayList<Product> selecAll();


    Product selctOne( int pid);

    ArrayList<Product> selectMore(String panme);
}
