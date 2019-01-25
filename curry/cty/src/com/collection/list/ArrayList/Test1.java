package com.collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:cty
 * @Date:2019/1/23 18:59
 * @Description:不负自己
 */
public class Test1 {
    //    List集合存储字符串并遍历
    public static void main(String[] args) {
//    创建集合遍历
        List li = new ArrayList();
//    创建字符串并添加字符
        li.add("你是谁");
        li.add("我不知道");
        li.add("cty");
//        Object O=li.remove(2);这是把第二个元素删除了
//        System.out.println(li);
//        li.set(2,"cty");//这是把第二个元素修改了
        System.out.println(li);
//    遍历集合
//    用迭代器进行遍历
//    ListIterator o=li.listIterator();//这是list特有的迭代器
        Iterator o = li.iterator();//这是普通的迭代器
        while (o.hasNext()) {
            String s = (String) o.next();
            System.out.println(s);
        }
    }
}
