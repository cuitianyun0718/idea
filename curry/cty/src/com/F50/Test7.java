package com.F50;

/**
 * @Author:cty
 * @Date:2019/1/28 20:33
 * @Description:不负自己
 */
public class Test7 {
//    计算2+22+222+2222+22222
public static void main(String[] args) {

    int x=2;
    int sum=0;
    while(x<22223){
        sum+=x;
        x=x*10+2;

    }
    System.out.println("和为"+sum);
}

}
