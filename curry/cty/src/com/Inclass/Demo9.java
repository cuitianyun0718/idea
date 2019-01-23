package com.Inclass;
//一个数字，这个数字乘以9的倍数，得出的结果每一位都相同
//这个数字不是0
public class Demo9 {
    public static void main(String[] agrs){

        int x=1;

        int y=9;

        String zh="";
        System.out.println("c");


        while(true){
            int count=0;
//            这个数字乘以9的倍数
            for(int a=1;a<=10;a++){
//                获取结果
                count =x*y*a;
//                结果装换成字符串
                zh=zh+count;
//                获取位数
                zh.length();
                int ws=zh.length();
//                声明卫视的变量
                int ge=0;
                int shi=0;
                int bai=0;
                int wan=0;
                int qian=0;
                int shiwa=0;
                switch (ws){
                    case 2:
                        ge=count%10;
                        shi=count/10;
                        if(ge==shi){

                        }
                        break;

                    case 3:
                        ge=count%10;
                        shi=count/10%10;
                        bai=count/100;
                        if(ge==shi&&ge==bai&&ge==qian){

                        }
                        break;


                    case 4:
                        ge=count%10;
                        shi=count/10%10;
                        bai=count/100%10;
                        qian=count/1000;
                        if(ge==shi&&ge==bai&&ge==qian){

                        }

                        System.out.println(count);
                        break;
                    case 5:
                    case 6:
                    case 7:

                }


            }


//            需要判断他乘以9的倍数之后的位数

        }

    }


}
