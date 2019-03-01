package com.DuoXianCheng;

import com.collection.Map.TreeMap.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:cty
 * @Date:2019/1/30 9:26
 * @Description:不负自己
 */
public class Test6Demo {
    public static void main(String[] args) {
//        创建一个多线程对象
       Test6 t=new Test6();
       Test6 t1=new Test6();
       t.start();
       t1.start();

    }
}
