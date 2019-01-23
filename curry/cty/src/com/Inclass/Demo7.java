package com.Inclass;

public class Demo7 {
    public static void main(String[] args){
        int a []= {99,16,19,15,89};
        int max=a[0];
        for(int x=1;x<a.length;x++){
            if(a[x]>max){
                max=a[x];

            }
        }
        int mix=a[0];{
            for(int y=1;y<a.length;y++){
                if(a[y]<mix){
                    mix=a[y];
                }
            }
        }
        System.out.println("最大数是"+max);
        System.out.println("输出的最小的数是"+mix);


    }

    }


