package com.API.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author:cty
 * @Date:2019/1/22 19:21
 * @Description:不负自己
 */
public class Test9 {
    public static void main(String[] args) {
//        正则表达式的应用
        Pattern p=Pattern.compile("a*b");
        Matcher m=p.matcher("b");
         boolean b=m.matches();
        System.out.println(b);



    }
}
