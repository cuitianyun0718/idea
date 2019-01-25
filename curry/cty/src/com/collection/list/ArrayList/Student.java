package com.collection.list.ArrayList;

/**
 * @Author:cty
 * @Date:2019/1/25 15:37
 * @Description:不负自己
 */
public class Student {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(String name, String age) {
        this.name = name;

        this.age = age;
    }
}
