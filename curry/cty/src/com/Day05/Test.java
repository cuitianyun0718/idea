package com.Day05;

/**
 * @Author:cty
 * @Date:2019/1/15 19:28
 * @Description:不负自己
 */
public class Test {
    public static void main(String[] args) {
//        有继承关系
//        有方法重写
//        有父类引用指向子类对象

//下面new两个对象
        Animal cat =new Cat();
        Animal dog=new Dog();

//        cat.eat();
//        cat.Sleep();
//        dog.eat();
//        dog.Sleep();
//        多态的成员访问特点
//        cat.name="咪咪";
//        dog.name="旺旺";
        System.out.println(cat.name);
        System.out.println( dog.name);



//        多态的成员访问特点
    }

}
