package com.collection.Collectios;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Author:cty
 * @Date:2019/1/24 19:23
 * @Description:不负自己
 */
public class Test {
    public static void main(String[] args) {
//        创建一个集合对象
        List<Integer> L=new ArrayList<Integer>();
//        添加元素
        L.add(26);
        L.add(22);
        L.add(20);
        L.add(219);
//        下面这个是输出这个集合
        System.out.println(L);
        System.out.println("===============");
        Collections.sort(L);//这是在排序
        System.out.println(L);
        System.out.println("=============");
//      这是在输出最大值
        System.out.println( Collections.max(L));

        System.out.println("====================");


         Collections.reverse(L);
        System.out.println(L);//这是在反转
        System.out.println("===================");
        Collections.shuffle(L);//随机置换
        System.out.println(L);




    }
}
