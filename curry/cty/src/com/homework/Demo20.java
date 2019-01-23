package com.homework;

/**
 * @Author:cty
 * @Date:2019/1/14 8:56
 * @Description:不负自己
 */
public class Demo20 {
    public static void main(String[] args) {

    }
    public static void max_min(int m, int n) {

        int temp = 1;
        int yshu = 1;
        int bshu = m*n;
        if(n<m){
            temp = n;
            n = m;
            m = temp;
        }
        while(m!=0){
            temp = n%m;
            n = m;
            m = temp;
        }
        yshu = n;
        bshu /= n;
        System.out.println(m+"和"+n+"的最大公约数为"+yshu);
        System.out.println(m+"和"+n+"的最小公倍数为"+bshu);
    }
    }

