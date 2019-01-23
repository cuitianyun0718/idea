package com.Day03;

/**
 * @Author:cty
 * @Date:2019/1/14 18:15
 * @Description:不负自己
 */
public class Student {
    private String name;
    private String sex;
    private int  age;
     public final int bj=1;
//    这是一个静态变量

    {
        System.out.println("创建对象的时候");

    }
    public int grt(){
//        bj=5;
        return bj;

    }
    static {
        System.out.println("这是一个静态代码块");
    }
    public static int water=10;
//    这也是个静态变量
    public static int money=100;

    public String Name() {
        return name;

    }

    public void Name(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    申明一个静态方法
public static void getWater (){
    System.out.println("喝水,每次要喝一升水");
    water--;
    System.out.println("我们的水还剩"+water);
//    在声明一个静态方法


}
public static void getMoney(){

    money++;
    System.out.println("我们现在还有"+money+"元");
}
}
