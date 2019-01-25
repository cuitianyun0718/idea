package com.collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author:cty
 * @Date:2019/1/23 19:35
 * @Description:不负自己
 */
public class Test2 {
//    ArrayList的使用
public static void main(String[] args) {
//    首先创建一个集合对象
    ArrayList<String> a=new ArrayList<String>();
//    创建元素对象，并添加元素
    a.add("崔天云");
    a.add("curry");
    a.add("james");
//    下面开始遍历
    Iterator li=a.iterator();//迭代器开始遍历
    while (li.hasNext()){
        Object o=li.next();
        System.out.println(o);
    }


}
}
