package com.API.Test;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

/**
 * @Author:cty
 * @Date:2019/2/28 10:06
 * @Description:不负自己
 */
public class Test11 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        SimpleDateFormat s=new SimpleDateFormat("YYY-MM-dd");
        System.out.println(s.format(d));
        Calendar c=Calendar.getInstance();
//        c.add(Calendar.MONTH,5);
        c.add(Calendar.DATE,20);
        System.out.println(c.get(Calendar.MONTH)+1+"月"+c.get(Calendar.DATE));
//
//
//        Random random=new Random();
////        System.out.println(random.nextInt(999))
//
//        Random random1=new Random();




//        System.out.println(random1.nextInt(5));
//        System.out.println(random1);
//
//        Random random2=new Random();
//        random2.nextInt(5);
//        System.out.println(random2);
//
//        Random random3=new Random();
//        random3.nextInt(5);
//        System.out.println(random3);
//
//        Random random4=new Random();
//        random4.nextInt(5);
//        System.out.println(random4);
//
//        Random random5=new Random();
//        random5.nextInt(5);
//        System.out.println(random5);
//        把数组转换为字符串

//        int s1[]={5,645,452};
//String os=Arrays .toString(s1);
////        System.out.println(s1);
//        String ss="fdjgng";
//
////        把字符串转换为字符数组
//        char [] chars=ss.toCharArray();
//        for (char c:chars
//             ) {
//            System.out.print(c);




        }
























    }

