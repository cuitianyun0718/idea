package com.itdr.test;
import com.itdr.data.CommonDataImp;

import java.util.ArrayList;

/**
 * @Author:cty
 * @Date:2019/2/19 18:29
 * @Description:不负自己
 */
public class CartDemo {
    public static void main(String[] args) {


        ArrayList a1 = new ArrayList();

        for (Object o : a1) {
            System.out.println(o.hashCode());
        }


    }
}
