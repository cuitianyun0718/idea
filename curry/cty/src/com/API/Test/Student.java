package com.API.Test;

/**
 * @Author:cty
 * @Date:2019/1/17 14:40
 * @Description:不负自己
 */
public class Student implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
