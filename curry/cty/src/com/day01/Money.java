package com.day01;
/*小芳现在成长了，每月工资3000元，每月基本花销是工资的一半，如果赶上每月的3号，小芳都要庆祝一下，出去吃一顿，一般会花费
当前手里钱的2%，后来，小芳学会了理财，她想把钱放到余额宝里，余额宝每月10号的时候收取一笔服务费用，为账户总资产的0.01%；
每天余额宝的利息是账户总资产的1%，每月6号的时候，当天利息会变成3%，请问当小芳存的钱是多少时，每月的利息能够
超过100元，什么时候能实现这个愿望呢？*/

public class Money {
    public static void main(String[] agrs) {
        double monney = 1500;
        double days = 0;
        double lixi = 0;

        while (lixi <= 100) {
            lixi = monney * 0.01 + lixi;
            days++;
            //每月三号花2%
            if (days % 30 == 3) {
                monney = monney - (monney * 0.02);
                //每月10号收服务费
                if (days % 30 == 10) {
                    monney = monney - (monney * 0.0001);
                    if (days % 30 != 6) {
                        lixi = monney * 0.01;
                        monney = monney + lixi;
                        if (days % 30 == 6) {
                            lixi = monney * 0.03;
                            monney = monney + lixi;
                            if (days % 30 == 0) {
                                monney = monney + 1500;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(days);
        System.out.println(monney);
    }
}