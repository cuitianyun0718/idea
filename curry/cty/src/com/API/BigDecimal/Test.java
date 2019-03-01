package com.API.BigDecimal;

import java.math.BigDecimal;

/**
 * @Author:cty
 * @Date:2019/1/26 23:14
 * @Description:不负自己
 */
public class Test {
    public static void main(String[] agrs) {
        BigDecimal b1 = new BigDecimal(0.09);
        BigDecimal b2 = new BigDecimal(0.01);
        System.out.println(b1.add(b2));
        System.out.println("-------------------");

        BigDecimal bd3 = new BigDecimal("1.0");
        BigDecimal bd4 = new BigDecimal("0.32");
        System.out.println("subtract:" + bd3.subtract(bd4));
        System.out.println("-------------------");
    }

}