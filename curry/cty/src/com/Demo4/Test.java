package com.Demo4;

/**
 * @Author:cty
 * @Date:2019/1/15 8:35
 * @Description:不负自己
 */
public class Test {
    public static void main(String[] args) {
        BigFish bf=new  BigFish();
        bf.TX="大";
        bf.age=100;
        bf.price=10;
        bf.setLiliang("强");
        bf.shou();
        System.out.println(bf.age);
//        创建一个对象
        SmallFish s=new SmallFish();

        System.out.println("小鱼的体型是"+s.TX);
    }
}
