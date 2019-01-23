package com.Day03;
import java.util.HashSet;
import java.util.Random;


/**
 * @Author:cty
 * @Date:2019/1/14 20:18
 * @Description:不负自己
 */
public class Demo2 {
    public static void main(String[] args) {
        // 创建随机数对象
        Random r = new Random();

        // 创建一个Set集合
        HashSet<Integer> ts = new HashSet<Integer>();

        // 判断集合的长度是不是小于10
        while (ts.size() < 11) {
            int num = r.nextInt(20)+1;
            ts.add(num);
        }

        // 遍历Set集合
        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}



