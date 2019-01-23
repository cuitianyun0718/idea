package com.homework;

/**
 * @Author:cty
 * @Date:2019/1/13 19:46
 * @Description:不负自己
 */
public class Demo16 {
//    需求A:1-100之和
//    B；1-100之间的偶数和
//    c:1-100之间的奇数和
public static void main(String[] args) {
    int sum=0;
    for(int x=1;x<100;x++){
        sum+=x;
    }
    System.out.println("1-100之间的和"+sum);
    int sumo=0;
    for( int y=1;y<100;y++ ){
        if(y%2==0){
            sumo+=y;
        }
    }
    System.out.println("1-100之间的偶数和为"+sumo);
    int sumj=0;
    for(int z=1;z<100;z++){
        if(z%2==1){
            sumj+=z;
        }
    }
    System.out.println("1-100之间的奇数和为"+sumj);
}

}
