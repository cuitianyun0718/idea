package com.Day05;

/**
 * @Author:cty
 * @Date:2019/1/15 19:32
 * @Description:不负自己
 */
public class Cat extends Animal {
    public String name="maomao";
    public int age=1 ;
//方法重写
    public void eat() {
        System.out.println("猫吃🐠");
    }


    public void Sleep() {
        System.out.println("猫躺着睡");
    }
}
