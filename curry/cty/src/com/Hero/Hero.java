package com.Hero;

/**
 * @Author:cty
 * @Date:2019/1/17 12:53
 * @Description:不负自己
 */
public abstract class Hero implements CommonFun,FuWen{
    public String name;
    public abstract void move(String name);
    public abstract void act(String name);
//    public abstract void commonFun();
}
