package com.collection.Set.LinkedHashSet;

import java.util.LinkedHashSet;

/**
 * @Author:cty
 * @Date:2019/1/23 21:57
 * @Description:不负自己
 */
public class Test1 {
    public static void main(String[] args) {
//        LinkedHashSet的练习
//        首先创建一个集合的对象
        LinkedHashSet<String> L=new LinkedHashSet <String>();
//        往集合里添加元素
        L.add("cty");
        L.add("curry");
        L.add("james");
        L.add("cty");
//        遍历
        for(String s:L){
            System.out.println(s);
        }

    }
}
