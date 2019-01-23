package com.homework;

/**
 * @Author:cty
 * @Date:2019/1/13 19:55
 * @Description:不负自己
 */
public class Demo17 {
    public static void main(String[] args) {
        int x = 1,y = 1;
//分析下面这个式子，这个式子两面都要判断，左面是真的，右边++y其实的等于1；所以
//        这个判断式是假的，跳出这个循环，不执行x=7，最后输出x=2，y=2
        if(x++==2 & ++y==2)
        {
            x =7;
        }
        System.out.println("x="+x+",y="+y);
    }
}
