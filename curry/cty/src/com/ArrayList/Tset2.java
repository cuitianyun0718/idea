package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author:cty
 * @Date:2019/1/22 9:18
 * @Description:不负自己
 */
public class Tset2 {
    public static void main(String [] args){
//        先创建一个集合
        List li =new ArrayList();
//       存储几个元素
        li.add("大家好");
        li.add("才是");
        li.add("真的好");
//        创建一个迭代器

//        for (int i = 0; i <li.size() ; i++) {
//           Object O= li.get(i);
//            System.out.println(O);
//        }
//        创建一个迭代器
        ListIterator lt =li.listIterator();
        while (lt.hasNext()){
            Object o= lt.next();
//            System.out.println(o);
            lt.remove();
//            System.out.println("=============");
            System.out.println(o);
        }

////        再次使用迭代器进行逆序遍历
//        while (lt.hasPrevious()){
//            Object o=lt.previous();
//            System.out.println(o);
//        }


    }
}
