package com.Hero;

/**
 * @Author:cty
 * @Date:2019/1/17 12:58
 * @Description:不负自己
 */
public class FAShi extends Hero{

//下面这几个是方法重写
    @Override
    public void move(String name) {
        System.out.println( name+"法师飘着走");
    }

    @Override
    public void act(String name) {
        System.out.println(name+"法师远程攻击");


    }

    @Override
    public void fu(String name) {
        System.out.println(name+"法师用法师符文");
    }

    @Override
    public void special(String name) {
        System.out.println(name+"疾跑");
    }
}
