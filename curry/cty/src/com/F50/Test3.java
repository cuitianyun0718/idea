package com.F50;

/**
 * @Author:cty
 * @Date:2019/1/28 8:36
 * @Description:不负自己
 */
public class Test3 {
//    打印出所有的水仙花数，
//    水仙花数：一个三位数，其各位上的立方和等于概数本身
//    例如：153=1^3+5^3+3^3
public static void main(String[] args) {
    int count=0;
    for (int i=100;i<1000;i++){
        int ge=i%10;
        int shi=i/10%10;
        int bai=i/100%10;
        if(i==ge*ge*ge+shi*shi*shi+bai*bai*bai){
            System.out.println("水仙花数是"+i);
            count++;
        }

    }
    System.out.println("水仙花个数是"+count);

}
}
