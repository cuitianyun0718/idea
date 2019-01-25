package com.collection.Set.TreeSet;

import java.util.TreeSet;

/**
 * @Author:cty
 * @Date:2019/1/23 22:03
 * @Description:不负自己
 */
public class Test1 {
//    TreeSet的小练习
//    首先创建一个及格的对象、
//    能够对元素进行某种规则进行排序
public static void main(String[] args) {
    TreeSet<Integer> t=new TreeSet<Integer>();
//    往集合里添加元素
    t.add(12);
    t.add(15);
    t.add(11);
    t.add(15);
//    遍历
    for(Integer s:t){
        System.out.println(s);
    }
}


}
