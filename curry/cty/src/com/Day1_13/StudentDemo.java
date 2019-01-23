package com.Day1_13;

/**
 * @Author:cty
 * @Date:2019/1/13 14:12
 * @Description:不负自己
 */
public class StudentDemo {
    public static void main(String[] args) {
//        这是在new一个对象
        Student ss=new Student();
//        下面这是在给对象赋值
        ss.setName("cty");
//        然后接受下
        String name =ss.getName();
        System.out.println("名字是"+name);
        ss.setAge("18");
        String age=ss.getAge();
        System.out.println("年龄是"+age);
        ss.setSex("nan");
        String SEX=ss.getSex();
        System.out.println("性别是"+SEX);
    }
}
