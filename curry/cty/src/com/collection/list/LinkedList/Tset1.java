package com.collection.list.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author:cty
 * @Date:2019/1/23 20:10
 * @Description:不负自己
 */
public class Tset1 {
    //    去除集合中的字符串的重复值
//    分析：
//    1，创建集合对象
//    2，添加多个元素到字符串元素
//    3，遍历旧集合，获取到每一个元素
//    4拿着个元素到新集合中去找，看看有没有
//    有：不搭理他
//    没有，就添加带新集合
//    5，遍历新集合
    public static void main(String[] args) {
//    创建一个集合对象
        ArrayList a = new ArrayList();
//    添加元素到集合中
        a.add("hello");
        a.add("cty");

        a.add("world");
        a.add("cty");
        a.add("world");
        a.add("hello");
        a.add("world");


        a.add("cty");
//    创建新集合
        ArrayList a1 = new ArrayList();
//    遍历旧集合，获取每一个元素
        Iterator li = a1.iterator();
        while (li.hasNext()) {
//            Object o = li.next();
            String S=(String) li.next();
//        拿这个元素到新集合中去找，看看有没有
            if (!a1.contains(S)) {
                a1.add(S);
            }

        }
//    遍历新集合
//        for (Object O : a1) {
//            System.out.println(O);
//        }
        for (int x = 0; x < a1.size(); x++) {
            String s = (String) a1.get(x);
            System.out.println(s);
        }


    }
}
