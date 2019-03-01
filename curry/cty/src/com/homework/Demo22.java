package com.homework;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/2/23 10:53
 * @Description:不负自己
 */
public class Demo22 {

//    二分查找
   public static int erFen(int [] arr,int n){
       int max=arr.length-1;//最大索引
       int min=0;//最小索引

       int mid=(max+min)/2;//中间索引

//       那中间索引的值和要查找的值进行比较
       while (arr[mid]!=n){
           if(arr[mid]>n){
               max=mid-1;

           }
           else if (arr[mid]<n){
               min=mid+1;
           }
//           加入判断
           if (min>max){
               return-1;
           }
           mid=(max+min)/2;
       }
       return mid;


   }

    public static void main(String[] args) {
        int[] arr = {85, 654, 12, 6, 55, 1, 2};
        Demo22.erFen(arr, args.length);
        Demo21.result(arr,arr.length);
    }

}



