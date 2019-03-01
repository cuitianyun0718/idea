package com.itdr.test;

import com.itdr.controller.qiantai.UserController;

import java.util.Scanner;

/**
 * @Author:cty
 * @Date:2019/1/30 19:53
 * @Description:不负自己
 */
public class TestDomo {

    //
    private static UserController uc = new UserController();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  测试注册

        System.out.println("注册:" + uc.register(sc.next(), sc.next()));
//登录过程

        System.out.println("登录:" + uc.login(sc.next(), sc.next()));

//        获取一个用户的信息
        System.out.println("用户信息"+ uc.show(sc.next()).getUpassword());
    }

}
