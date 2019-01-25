package com.collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author:cty
 * @Date:2019/1/23 10:30
 * @Description:不负自己
 */
public class Test4 {
    public static void main(String[] args) {
//练习：用集合存储五个对象，并把学生对象进行遍历
//        分析：1创建学生类
//        2，创建集合对象
//        3，创建学生对象
//        4把学生添加到集合中
//        5，把集合装换成数组
//        6，遍历数组


//        创建集合对象
        Collection c=new ArrayList();
//        创建学生对象
        Student s1=new Student();
        s1.setName("库里");
        s1.setAge(28);
        Student s2=new Student();
        s2.setName("詹姆斯");
        s2.setAge(34);
//        把学生添加到集合里
        c.add(s1.getName()+s1.getAge());
        c.add(s2.getName()+s2.getAge());

//        把集合装换为数组
//        Object o=c.toArray();
//        遍历数组,用增强for来写
        for(Object s:c){
            System.out.println(s);

        }
//        下面用迭代器来写
       Iterator i=c.iterator();
        while (i.hasNext()){
          Object o=  i.next();
            System.out.println(o);
        }





        }

}
