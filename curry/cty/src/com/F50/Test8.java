package com.F50;

/**
 * @Author:cty
 * @Date:2019/1/29 8:33
 * @Description:不负自己
 */
public  class Test8  {
//    给定一个数组，求它的平均值和最大值，最小值
    public static void main(String[] args) {
        int a[]={-10,2,3,246,-100,0,5};
        double sum=0;
        for(double i:a){
            sum=sum+i;

        }
        System.out.println("平均值是"+sum/a.length);
        int max=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>max){
                max=a[i];
            }

        }
        System.out.println("最大值是"+max);
        int mix=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]<mix){
                mix=a[i];
            }

        }
        System.out.println("最小值是"+mix);
    }


}