package com.itdr.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:cty
 * @Date:2019/2/7 16:00
 * @Description:不负自己
 */
public class Pub <T>{
//    public static int SUCCESS_CODE;
//    private Map map = new HashMap();

    private T t;
    private int tock;



    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getTock() {
        return tock;
    }

    public void setTock(int tock) {
        this.tock = tock;
    }

    //    成功标记
   public static final int SUCCESS_CODE = 100;
    //    失败标记
    public static final int FAIL_CODE = 300;

//    1，这里我在使用方法的时候，应该返回这个类的对象，对象中的成员变量map封装了数据和状态码
//    2，那数据只能通过方法传递参数的形式传进来，传参可能是各种数据类型的对象或者数据，这里应该写成什么样子的
//    的参数才比较好呢？
//    3，这些方法都应该返回Pub类的对象，把数据封装到对象的成员变量中
//    4，怎么把数据封装到成员变量map中呢


//    public Map getMap() {
//        return map;
//    }
//
//    public void setMap(Map map) {
//        this.map = map;
//    }

    //    成功返回数据
    public static <E> Pub success(E e) {
//        创建对象
        Pub<E> p = new Pub();
//        p.map.put(t, SUCCESS_CODE);
//        返回到封装好的数据
        p.setT(e);
        p.setTock(SUCCESS_CODE);
        return p;
    }

    //    失败返回数据
    public static Pub fail(String s) {
        //创建对象
        Pub<String> p = new Pub();
//        p.map.put(s, FAIL_CODE);
        p.setT(s);
        p.setTock(FAIL_CODE);

        //返回封装好数据的对象

        return p;
    }
}
