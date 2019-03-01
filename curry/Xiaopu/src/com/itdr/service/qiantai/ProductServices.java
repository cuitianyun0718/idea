package com.itdr.service.qiantai;

import com.itdr.common.Pub;
import com.itdr.domain.Product;

import java.util.ArrayList;

/**
 * @Author:cty
 * @Date:2019/1/30 21:58
 * @Description:不负自己
 */
public interface ProductServices {
    ArrayList<Product> showAll();

    Product showOne(int pid);

    ArrayList<Product> selectMore(String pname);
}
