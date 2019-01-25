package com.collection.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author:cty
 * @Date:2019/1/22 8:44
 * @Description:不负自己
 */
public class Test1 {
    public static void main(String[] args) {

//        先创建一个集合对象
        Collection a=new ArrayList();
//        测试 boolean add(Object obj):添加一个元素
       a.add("hello");
        a.add("world");
        a.add("java");
//        这是在判断元素的个数
        System.out.println(a.size());
//       这是在判读集合是否为空
        System.out.println(a.isEmpty());
//        判断集合中是否包含“hello”
        System.out.println(a.contains("hello"));
        System.out.println(a.remove("hello"));
        System.out.println(a.size());
a.remove("java");
        System.out.println(a);
//        void clear(a);
    }
}
