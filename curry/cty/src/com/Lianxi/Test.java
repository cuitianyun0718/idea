package com.Lianxi;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/21 8:59
 * @Description:不负自己
 */
public class Test {
    public static void main(String[] args) {
        Student st=new Student();
        Scanner sc=new Scanner(System.in);
        String name=sc.next();

        st.AddName( name);

    }
}
