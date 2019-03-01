package com.API.Test;

/**
 * @Author:cty
 * @Date:2019/1/17 16:07
 * @Description:不负自己
 */
public class Test4 {
    public static void main(String[] args) {
        String s = "cuitianyun";
//        int i = "cuitianyun".length();
//        System.out.println(i);
//        s+="崔天云";
        s=s+"崔天云";
        System.out.println(s);
//
//        比较两个值相同的String对像
        String s1="cuitianyun";
        System.out.println(s==s1);
//        再次比较两个数
        String s2=new String("cuitianyun");
//        s2="cuitianyun";
//
        System.out.println(s2==s);
    }
}
