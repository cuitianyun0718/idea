package com.F50;

/**
 * @Author:cty
 * @Date:2019/1/26 23:27
 * @Description:不负自己
 */
public class Test2 {

    //    题目：判断101-200之间有多少个素数，并输出所有素数。
//    程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
    public static void main(String[] args) {
        int sum = 0;

        for (int x = 101; x < 200; x++) {
            boolean i = true;
            for (int j = 2; j < x; j++) {
                if (x % j == 0) {
                    i = false;
                    break;
                }

            }
            if (i == true) {
                System.out.println("素数分别是"+x);
            }


        }

    }

}



