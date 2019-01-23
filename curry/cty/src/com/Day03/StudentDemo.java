package com.Day03;

/**
 * @Author:cty
 * @Date:2019/1/14 18:25
 * @Description:不负自己
 */
public class StudentDemo {
    public static void main(String[] args) {
//        ceshilei
        Student s=new Student();

        s.Name("崔天云");
        String name =s.Name();
//
        System.out.println("名字是"+name);
        System.out.println("现在还有这么多水"+Student.water+"升");
        System.out.println(s.Name()+"同学要喝水了");
//        调用该方法
        Student .getWater();
        Student.getMoney();

        System.out.println("============================");
        Student s1=new Student();
        s1.setAge(18);
        int age=s1.getAge();
        System.out.println("年龄是"+age);

        Student.getWater();

        Student.getMoney();
        System.out.println("===========================");
        Student s2=new Student();
        Student.getWater();
        Student.getMoney();

    }
}
