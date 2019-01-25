package com.collection.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author:cty
 * @Date:2019/1/23 21:27
 * @Description:不负自己
 */
public class Test1 {
    public static void main(String[] args) {
//        HashSet的小练习
//        首先创建一个集合对象
        Set<String> s=new HashSet<String>();
//        往集合里添加元素
        s.add("cty");
        s.add("curry");
        s.add("james");
        s.add("kobe");
//        用增强for进行遍历
        for (String s1:s ){
            System.out.println(s1);
        }
    }
}
