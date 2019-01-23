package com.Day06;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/17 10:29
 * @Description:不负自己
 */
public class Demo1 {
    public static void main(String[] args) {
//        输入一个字符串，要求出它的大写字母和小写字母的个数

int big=0;
int small=0;
int number=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串字符");
        String line=sc.nextLine();
//        把字符串装换为字符组
        char[] s=line.toCharArray();
//        遍历
        for(int i=0;i<s.length;i++){
            char ss =s[i];
//            判断该字符
            if(Character.isUpperCase(ss)){
                big++;
            }
            if(Character.isLowerCase(ss)){

                small++;
            }if(Character.isDigit(ss)){
                number++;
            }

        }
        System.out.println("大写字母有"+big+"个");
        System.out.println("小写字母有"+small+"个");
        System.out.println("数字有"+number+"个");

    }


}
