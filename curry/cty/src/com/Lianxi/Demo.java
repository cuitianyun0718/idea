package com.Lianxi;

//下面这是奥便利一个数组
public class Demo {
    public static void main(String[] agrs) {
//        int x[][] = new int[5][2];
//        for (int a = 0; a < x.length; a++) {
//            for (int b = 0; b < x[a].length; b++) {
//                System.out.println(x[a][b]);
//            }
//        }
        int a[]={56,45,454,4415,545};
        int max=a[0];
        for(int z=0;z<a.length;z++){
            if(a[z]>max){
                max=a[z];

            }

        }
        System.out.println("最大的数是"+max);
    }


}
