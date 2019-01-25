package com.collection.list.Vector;

import java.util.Vector;

/**
 * @Author:cty
 * @Date:2019/1/23 19:46
 * @Description:不负自己
 */
public class Test1 {
    //    Vector的练习
    public static void main(String[] args) {
//    首先创建集合对象
        Vector v = new Vector();
//    添加元素给集合
        v.addElement("hello");
        v.add("cty");//这个是把元素添加到向量的末尾
        v.addElement("world");
        v.addElement("curry");

        System.out.println(v.elementAt(2));
//    用增强for开始遍历
        for (Object S : v) {
            System.out.println(S);
        }
    }
}
