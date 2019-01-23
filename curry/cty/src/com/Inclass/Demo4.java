package com.Inclass;

public class Demo4 {
    public static void main(String[] args){
//        小芳的妈妈每天给她2.5元钱，她都会存起来，
//但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
//请问，经过多少天，小芳才可以存到100元钱
//        声明问题中涉及的变量
        double money = 0;
        int days = 0;
//        重现问题的解决过程。
        while(money<100){
//            资金在每天增加
            money=money+2.5;
//            天数在每天变化；
            days ++;
            if(days%5==0){
                money=money-6;
            }



        }
        System.out.println("小芳需要存"+days+"天，就会存到100元");
    }

}
