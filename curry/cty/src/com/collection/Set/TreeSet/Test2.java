package com.collection.Set.TreeSet;

import java.util.TreeSet;

/**
 * @Author:cty
 * @Date:2019/1/23 22:16
 * @Description:不负自己
 */
public class Test2 {
//    需求：按照姓名的长度进行排序
public static void main(String[] args) {
//    首先创建一个集合的对象
    TreeSet<String> t =new TreeSet<String>();
    t.add("acceee");
    t.add("acceeeee");
    t.add("accfge");
    t.add("accg");
//    遍历
    for(String S:t){
        System.out.println(S);
    }
}
}
