package com.Hero;

/**
 * @Author:cty
 * @Date:2019/1/16 19:52
 * @Description:不负自己
 */
public class Cike extends Sheshou  {
    private String name= "元歌";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void act(){
        System.out.println("英雄正在近身攻击");
    }
    public void bs(){
        System.out.println(name+"正在变身");
    }

}
