package com.API.Test;

/**
 * @Author:cty
 * @Date:2019/1/17 15:07
 * @Description:不负自己
 */
public class Test3 {
    public static void main(String[] args) throws CloneNotSupportedException{
//        验证下object里的clone方法
        Student s=new Student();

        s.setName("CURRY");

//        克隆学生对像
        Object clone = s.clone();
        Student s1=(Student)clone;

        System.out.println("s的名字是"+s.getName());
        System.out.println("s1的名字是"+s1.getName());

        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s.getClass()==s1.getClass());
        System.out.println(s.getClass().equals(s1.getClass()));



    }
}
