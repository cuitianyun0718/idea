package com.Day1_13;

/**
 * @Author:cty
 * @Date:2019/1/13 14:06
 * @Description:不负自己
 */
public class Student {
//    先给一些Student类的属性
    private String name;
    private String age;
    private String sex;
//    给他设置一些公共方法可以被调用
    public String getName(){
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String s){
        name=s;

    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
