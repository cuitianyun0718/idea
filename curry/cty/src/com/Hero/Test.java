package com.Hero;

/**
 * @Author:cty
 * @Date:2019/1/16 19:56
 * @Description:不负自己
 */
public class Test {
    public static void main(String[] args) {
       Sheshou ss= new Cike();
       String name=ss.name;
       name=((Cike) ss).getName();



        System.out.println(name);
        ss.act();


    }
}
