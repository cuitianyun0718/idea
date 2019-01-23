package com.Inclass;

public class Demo3 {
    public static void main(String[] args){
//        山峰高度为8848米，指的厚度为0.01米；
//        问题：这张纸对着多少次，高度可以超过8848米
        int x=884800;
        int y=1;
        int count =0;
        while(y<x){
            y=y*2;
            count++;
        }
        System.out.println("需要对折"+count+"次");
    }
}
