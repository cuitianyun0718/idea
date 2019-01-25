package com.collection.Set.HashSet;

import java.util.HashSet;

/**
 * @Author:cty
 * @Date:2019/1/23 21:34
 * @Description:不负自己
 */
public class Test2 {
    public static void main(String[] args) {
//        存储自定义对象
//        首先创建一个集合对象
        HashSet<Student> h = new HashSet<Student>();

//创建一个学生对象
        Student s1=new Student();
        s1.setName("cty");
        s1.setAge("20");
        Student s2=new Student();
        s2.setName("curry");
        s2.setAge("28");
//        把元素放进集合里
        h.add(s1);
        h.add(s2);
//        遍历集合
        for(Student O :h){
            System.out.println("姓名是: "+O.getName()+" 年龄： "+O.getAge());
        }


    }
}
