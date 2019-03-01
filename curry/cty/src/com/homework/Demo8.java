package com.homework;

public class Demo8 {
    public static void main(String[] agrs) {
//        byte b1 = 3, b2 = 4,b;
//        b = b1 + b2;
//
//        b = 3 + 4;
//        short s1=1;
//        byte s2=3;

//       public  set(int a){
//            a--;
//            System.out.println("a的函数值为："+a);
//        }  //构造函数


//        8、判断并输出500以内既能够被3整除又能够被6整除的整数。
        for (int x = 1; x <= 500; x++) {
            if (x % 3 == 0 && x % 6 == 0) {
                System.out.println(x);
            }
        }
    }
}
