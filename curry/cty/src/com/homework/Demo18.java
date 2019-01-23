package com.homework;

/**
 * @Author:cty
 * @Date:2019/1/13 20:04
 * @Description:不负自己
 */
public class Demo18 {
    //    判断101-100之间有多少个素数，并且输出所有素数之和
//    分析1；素数是啥：一个大于1的数，只能被1和它本身整除；
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
            if (i ==true){
                sum+=x;

                System.out.println("素数分别是" + x);
            }

        }

        System.out.println("素数之和为"+sum);
    }
}

