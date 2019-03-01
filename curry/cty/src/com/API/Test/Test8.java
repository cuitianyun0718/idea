package com.API.Test;

/**
 * @Author:cty
 * @Date:2019/1/22 19:02
 * @Description:不负自己
 */
public class Test8 {
    public static void main(String[] args) {
//        二分查找法查找一个数据
//        定义一个数组
        int [] arr={62,65,98,65,32,74,15,21,};
//        int index=getIndex(98);


    }

//    private static int getIndex(int i) {
//    }


    public static int getIndex( int [] arr,int value){
        int max=arr.length-1;
        int min=0;
        int mid=(max+min)/2;
        while (arr[mid]!=value){
            if (arr[mid]>value){
                max=mid-1;
            }
            else if (arr[mid]<value){
                min=mid+1;
            }
            if (min>max){
                return-1 ;

            }
            mid=(max+min)/2;
        }
        return mid;

    }
}
