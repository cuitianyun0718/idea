package com.Yemian;

/**
 * @Author:cty
 * @Date:2019/1/19 15:43
 * @Description:不负自己
 */
public class ShopCar {
//   创建一个数组类型为类的

    private User U;
//    创建一个数组
    private int [][]a=new int[5][1];


    public User getU() {
        return U;
    }
//
    public void setU(User u) {
        U = u;
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }
}
