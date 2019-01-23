package com.homework;

public class Demo8 {
    public static void main(String[] agrs){
//        8、判断并输出500以内既能够被3整除又能够被6整除的整数。
        for(int x=1;x<=500;x++){
            if(x%3==0&&x%6==0){
                System.out.println(x);
            }
        }
    }
}
