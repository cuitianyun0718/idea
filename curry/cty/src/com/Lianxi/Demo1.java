package com.Lianxi;

//由键盘录入两个数，比较他们的大小

import javax.xml.soap.SOAPPart;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out .println("请输入第一个数");
        int x=sc.nextInt();
        System.out.println("请输入令一个数");
        int y=sc.nextInt();
         int max;
         if(x>y){
             max=x;
         }
         else {
             max=y;
         }
         System.out.println(max);

    }
}
