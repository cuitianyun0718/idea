package com.itdr.web;

/**
 * @Author:cty
 * @Date:2019/2/27 8:37
 * @Description:不负自己
 */
public class Test {
    public static void pri(Object... ints) {
//动态参数
        for (Object a: ints
             ) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
//        pri(1,2,3,"崔天云","[215,63]");

    }
}
