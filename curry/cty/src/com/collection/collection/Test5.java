package com.collection.collection;

import java.util.*;

/**
 * @Author:cty
 * @Date:2019/1/23 11:41
 * @Description:不负自己
 */
public class Test5 {

    public static void main(String[] args) {
//   创建一个几个对象
        Collection c = new ArrayList();//接口不能实例化
        c.add("hello");
        c.add("wodld");
        c.add("java");
        int a = c.size();
        System.out.println(a);
        System.out.println(c);
//        把集合转换为数组
        Object [] o=c.toArray();
//        可以实现遍历
        for (int i = 0; i <o.length ; i++) {
//            System.out.println(o[i]);
//            这个可以获取长度，原因是Object中没有length（）的方法，
//            所以把元素还原成字符串
            String s=(String) o[i];//向下转型
            System.out.println(s+"---"+s.length());

        }


    }

}
