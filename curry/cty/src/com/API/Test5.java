package com.API;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author:cty
 * @Date:2019/1/17 19:55
 * @Description:不负自己
 */
public class Test5 {
    public static void main(String[] args) {
        String s="z";
        String s1="Z";
        System.out.println(s.equals(s1));
        System.out.println("==========================");
        String name ="cty";
        String uname="崔天云";
        System.out.println(name.equalsIgnoreCase(uname));
        System.out.println("==========================");

//        判断a是否包含b
        String a="abd";
        String b="acd";
        System.out.println(a.contains(b));
        System.out.println("==========================");
//        判断c这个字符串是否是以d这个字符串开始的
//        如果是就判断为true
        String d="ab";
        String c="abcdg";
        System.out.println( c.startsWith(d));
        System.out.println("============================");
//        指定后缀
        String e="abcde";
        String f="de";
        System.out.println(e.endsWith(f));
        System.out.println("==========================");

//        char charAt(int index)
//        返回一个字符

        char c1 = name.charAt(0);
        System.out.println(c1);
        char c2 = name.charAt(1);
        System.out.println(c2);
        char c3 = name.charAt(2);
        System.out.println(c3);
        System.out.println("===========================");
        char c4 = uname.charAt(2);
        System.out.println(c4);
        System.out.println("============================");

//        indexOf功能
//        A=65，  a=97
//        int indexOf(int ch)
        String s2="abcde";
        int i = s2.indexOf(97);
        System.out.println(i);
        System.out.println("==================");

//        int indexOf(String str)
        String s3="abcd";

        int i1 = s3.indexOf("ac");
        System.out.println(i1);
        System.out.println("=====================");

//        int indexOf(int ch,int fromIndex)
//        下面这个100代表要找的字母。也就是c，后面的2就是从第三个开始找，也就是
//        从c开始找，如果超过那个范围就会输出-1
        String s4="abcdefghigklmnopqrstuvwxyz";
        int jk = s4.indexOf(100, 3);
        System.out.println(jk);
        System.out.println("==============================");
//        int indexOf(String str,int fromIndex)
        String s5="abcdefghigklmnopqrstuvwxyz";
        int i2 = s5.indexOf("higklmn", 3);
        System.out.println(i2);
        System.out.println("==============================");


//        public String substring(int beginIndex)
//        这是截取字符串,这个10代表从第十个索引处开始截取，字符串从0开始
        String s6="abcdefghijklmnopqrstuvwxyz";
           String i3= s6.substring(10);
        System.out.println(i3);
//        这个是一个范围内截取字符串
//        public String substring(int beginIndex,in end)
        System.out.println("================================");


//        byte[] getBytes():把字符串转换为字节数组。
//字节数组就是说把字母转换为ASILL值。
        String s7="abcdefghijklmn";
       byte[] bs= s7.getBytes();
        for (int j = 0; j <bs.length ; j++) {
            System.out.print(bs[j]+",");

        }
        System.out.println("=====================");

// char[] toCharArray():把字符串转换为字符数组。
        String s8="ABCDEFG";
        char[] ch= s8.toCharArray();
        for (int j = 0; j < ch.length; j++) {
            System.out.print(ch[j]+" ");

        }
        System.out.println("===============");
        // static String valueOf(char[] chs):把字符数组转成字符串。
        String s9="abcdefghijklmnopq";

        String ss = String.valueOf(s9);
        System.out.println(ss);
        System.out.println("======================");
//        static String valueOf(int i):把int类型的数据转成字符串。
        int s10=100;
        String sss =String.valueOf(s10);
        System.out.println(sss);


//        String toLowerCase():把字符串转成小写。
        System.out.println(s8.toLowerCase());
        System.out.println("====================");
        // String concat(String str):把字符串拼接。
        String u1 = "hello";
        String u2 = "world";
        String u3 = u1 + u2;
        String u4 = u1.concat(u2);
        System.out.println("u3:"+u3);
        System.out.println("u4:"+u4);
    }
}
