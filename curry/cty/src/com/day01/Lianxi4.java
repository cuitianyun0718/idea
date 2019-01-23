package com.day01;

public class Lianxi4 {
    public static void main(String[] args){
//        1-100之内的偶数相加
        int sum =0;

        for(int x =1; x<=100; x++){
            if (x%2==0){
//                sum=x+sum;
                sum += x;
            }

        }
        System.out.println("1-100之间的偶数和为"+sum);
    }
}
