package com.DuoXianCheng;

/**
 * @Author:cty
 * @Date:2019/1/29 18:29
 * @Description:不负自己
 */
public class Test3 extends Thread {

private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void run() {
       for (int x=0;x<100;x++){
           System.out.println(getName()+":"+x);
       }
    }

    public Test3(String name){
       super(name);

    }

}
