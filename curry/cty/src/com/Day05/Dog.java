package com.Day05;

/**
 * @Author:cty
 * @Date:2019/1/15 19:34
 * @Description:不负自己
 */
public class Dog extends Animal {
//    成员变量
    public String name;
    public int age ;


//    方法重写
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void Sleep() {
        System.out.println("狗趴着睡");
    }
}
