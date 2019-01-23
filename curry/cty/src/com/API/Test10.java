package com.API;

/**
 * @Author:cty
 * @Date:2019/1/22 20:14
 * @Description:不负自己
 */
public class Test10 {
    public static void main(String[] args) {
        int a = 1;
        String s = "256";
        int b = Integer.parseInt(s);
        System.out.println(b + 1);
        System.out.println("=================");


//把String转换为int类型
        Integer ii = new Integer(s);
        System.out.println(ii);
        System.out.println("====================");
//        把任意十进制转换为二进制

        String s1 = Integer.toOctalString(20);
        System.out.println(s1);


    }
}
