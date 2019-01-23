package com.homework;

/**
 * @Author:cty
 * @Date:2019/1/13 19:24
 * @Description:不负自己
 */
public class Demo14 {
//    请在控制台输入五位数满足以下条件
//    1各位等于万位
//    2十位等于千位
//    3各位+十位+千位+万位=百位

//    分析如下
//    1，首先他是一个五位数
//    2然后应该分析每一位上的数
//    3按照要求进行判断
public static void main(String[] args) {
    for(int x=10000;x<100000;x++){
        int ge=x%10;
        int shi=x/10%10;
        int bai=x/100%10;
        int qian=x/1000%10;
        int wan=x/10000%10;
        if(ge==wan&&shi==qian&&(ge+shi+qian+wan==bai)){
            System.out.println("满足的数是"+x);
        }
    }
}
}
