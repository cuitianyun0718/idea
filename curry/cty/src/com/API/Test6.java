package com.API;

/**
 * @Author:cty
 * @Date:2019/1/22 18:11
 * @Description:不负自己
 */
public class Test6 {
    public static void main(String[] args) {
//        用冒泡排序，
//        冒泡排序：相邻元素比较，大的往后面放，第一次完毕，最大值出现在了最大索引处
//        首先定义一个数组，然后给它排序
        int arr[]={65,56,98,256,98,32,45,66};
        for (int x = 0; x < arr.length-1;x++){
            for (int y=0;y<arr.length-1-x;y++){
                if(arr[y]>arr[y+1]){
                    int temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {

            System.out.print(+arr[i]+" ");
        }
        System.out.println("]");


    }


}
