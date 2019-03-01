package com.itdr.service.qiantai;
import com.itdr.common.Pub;
import com.itdr.data.ProductData;
import com.itdr.data.ProductDataImp;
import com.itdr.domain.Product;

import java.util.ArrayList;

/**
 * @Author:cty
 * @Date:2019/2/19 19:06
 * @Description:不负自己
 */
public class ProductServiceImp implements ProductServices {
    private ProductData pd = new ProductDataImp();


    //展示所有商品的信息
    @Override
    public ArrayList<Product> showAll() {
        ArrayList<Product> li = pd.selecAll();


        if(li != null || li.size() != 0 ){
            return li;
        }
        return null;
    }
    //展示一个商品的信息
    @Override
    public Product showOne(int pid) {
        Product pro = pd.selctOne(pid);

        if(pro == null || pro.getSx() == 0 ){
            return null;
        }

        return pro;
    }
    //模糊搜索商品信息
    @Override
    public Pub selectMore(String pname) {
        ArrayList<Product> li = pd.selectMore(pname);
        Pub p = Pub.fail("您搜索的商品不存在");

        if(li != null && li.size() != 0 ){
            p = Pub.success(li);
            return p;
        }


        return p;
    }

}
