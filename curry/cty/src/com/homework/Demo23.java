package com.homework;

/**
 * @Author:cty
 * @Date:2019/2/26 8:39
 * @Description:不负自己
 */
public class Demo23 {
    public static void main(String[] args) {
//        把字节数组转换为字符串
        byte [] b={1,2,6,4,5};
        String s1=new String(b);

        System.out.println(s1);
        System.out.println(s1.length());
    }
}
