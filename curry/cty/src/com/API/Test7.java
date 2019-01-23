package com.API;

/**
 * @Author:cty
 * @Date:2019/1/22 18:46
 * @Description:不负自己
 */
public class Test7 {
    public static void main(String[] args) {
//        选择排序
//        从0索引处开始，以此和后面的元素进行比较，小的往前方，第一次完毕，最小值出现在了最小索引处
//        定义一个数组
        int arr[] = {65, 98, 56, 74, 21, 36, 35};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println("]");

    }
}