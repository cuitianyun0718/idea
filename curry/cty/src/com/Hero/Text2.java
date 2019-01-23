package com.Hero;

/**
 * @Author:cty
 * @Date:2019/1/17 13:03
 * @Description:不负自己
 */
public class Text2 {
    public static void main(String[] args) {
       Hero j = new FAShi() {
        };
        j.name="貂蝉";
        j.fu(j.name);
        j.move(j.name);
        j.act(j.name);
    }
}
