package com.Demo4;

/**
 * @Author:cty
 * @Date:2019/1/15 8:24
 * @Description:不负自己
 */
public class BigFish extends WaterAnimal{
    private String liliang;

    public void eatFish(){
        System.out.println("大鱼吃小鱼");

    }

    public String getLiliang() {
        return liliang;
    }

    public void setLiliang(String liliang) {
        this.liliang = liliang;
    }


    public void shou() {
        System.out.println("BigFish{" +
                "liliang='" + liliang + '\'' +
                ", TX='" + TX + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}');
    }
}
