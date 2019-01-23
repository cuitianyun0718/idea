package com.ArrayList;

import java.util.HashSet;
import java.util.Random;

/**
 * @Author:cty
 * @Date:2019/1/22 15:19
 * @Description:不负自己
 */
public class Test3 {
    public static void main(String[] args) {
//        编写一个获取随机数，10个1-20的随机数，要求不能重复
//创建随机数对象

        Random r=new Random();
//        创建一个集合
        HashSet<Integer> ts=new HashSet<Integer>();
        while(ts.size()<10){
            int num=r.nextInt(20)+1;
            ts.add(num);
        }
//        遍历集合
        for(Integer i:ts){
            System.out.println(i);
        }


    }
}
