package com.collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author:cty
 * @Date:2019/1/25 15:39
 * @Description:不负自己
 */
public class TestStudent {
//  遍历集合


    public static void main(String[] args) {
//        创建一个集合对象
        ArrayList<Student> a=new ArrayList<Student>();
//        创建元素对象
        Student s1=new Student("貂蝉","28");
        Student s2=new Student("诸葛亮","78");
        Student s3=new Student("曹操","58");
//        往集合里添加元素
        a.add(s1);
        a.add(s2);
        a.add(s3);
//        迭代器遍历集合
        Iterator<Student> aa=a.iterator();
        while (aa.hasNext()){
            Student ss=aa.next();
            System.out.println(ss.getName()+"---"+ss.getAge());
//
        }
        System.out.println("========================");
//        增强for遍历
        for(Student s:a){
            System.out.println(s.getName()+"==="+s.getAge());
        }
    }
}
