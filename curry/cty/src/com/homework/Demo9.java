package com.homework;

/**
 * @Author:cty
 * @Date:2019/1/13 19:10
 * @Description:不负自己
 */
public class Demo9 {
//    统计1000以内的水仙花数
//    水仙花数指的是一个三位数，及其各位上的立方和等于概数本身
//    例如153=1*1*1 + 5*5*5 + 3*3*3
//    定义统计变量，初始化为0；
//    可以用for循环
public static void main(String[] args) {
    int sum=0;
    for(int x=2;x<1000;x++){
        int ge=x%10;
        int shi=x/10%10;
        int bai=x/10/10%10;
//        按要求进行判断
        if(x==ge*ge*ge+bai*bai*bai+shi*shi*shi){
            sum++;
            System.out.println(x);

        }
    }
    System.out.println(sum);
}

}
