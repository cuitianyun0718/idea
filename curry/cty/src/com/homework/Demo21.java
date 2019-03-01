package com.homework;

import org.junit.Test;

/**
 * @Author:cty
 * @Date:2019/2/18 9:02
 * @Description:不负自己
 */
public class Demo21 {
    //    把冒泡排序抽取成一个方法
    public static void maopao(int[] a, int n) {

        for (int i = 0; i < n - 1; i++) {//表示n次排序过程
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {//前面的数字大于后面的就交换
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public static void result( int a[],int arr){
        System.out.print("[");

        for (int i = 0; i < arr; i++) {

            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[] arr = {85, 654, 12, 6, 55, 1, 2};

        Demo21.maopao(arr, arr.length);
        Demo21.result(arr,arr.length);


            }
        }




















