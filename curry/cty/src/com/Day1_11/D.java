package com.Day1_11;

/**
 * @Author:cty
 * @Date:2019/1/1120:01
 * @Description:不负自己
 */
public class D {
    //    判断101-200之间的有多少个素数
    public static void main(String[] args) {
        for (int x = 101; x < 200; x++) {
            boolean i = true;
            for (int y = 2; y < x; y++) {
                if (x % y == 0) {
                    i = false;
                    break;
                }
            }
            if (i == true) {
                System.out.println(x);
            }
        }
    }
}
