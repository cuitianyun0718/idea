package com.collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author:cty
 * @Date:2019/1/25 15:21
 * @Description:不负自己
 */
public class Tset3 {
//    存储字符串并遍历


public static void main(String[] args) {
//创建一个集合对象
    ArrayList<String> a=new ArrayList<String>();
//    往集合里添加元素
    a.add("hello");
    a.add("world");
    a.add("cty");
  Iterator<String> i= a.iterator();//这是一个迭代器
//    遍历
          while (i.hasNext()){
              String s=i.next();
              System.out.println(s);
          }
}
}
