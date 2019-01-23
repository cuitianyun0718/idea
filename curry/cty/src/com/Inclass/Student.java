package com.Inclass;

public class Student {
//    关于这个人物的属性，成员变量
    String name;
    String     age;
    String  xuehao;
//    关于这个人物类的方法；成员方法
    public  void play(String name){
        System.out.println(name+"正在打游戏");
    }
    public void eat(String name){
        System.out.println(name+"正在吃饭");
    }
    public static void main(String[] args){
//        创造一个对象
        Student x1=new Student();
        x1.name="cty";
        x1.age="eighteen";
        x1.xuehao="123456";
        Student x2=new  Student();
        x2.name="cty";
        x2.age="ten";
//        System.out.println();





        x1.play(x1.name);
        x2.eat(x2.name);

    }
}
