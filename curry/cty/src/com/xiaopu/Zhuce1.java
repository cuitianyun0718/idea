package com.xiaopu;

/**
 * @Author:cty
 * @Date:2019/1/19 12:18
 * @Description:不负自己
 */
import java.util.Scanner;

//1,输入账号和密码
//2创建账户，这时候要验证这个账户是否存在
//3如果存在，就显示注册失败。
//4如果不存在就表明注册成功。
//注册成功就跳转到登录页面。
public class Zhuce1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        接受注册信息
        System.out.println("请输入你想要的账号");
        String uname = sc.next();
        System.out.println("请输入密码，一定得记牢");

        String upassword = sc.next();
//        把这些信息放到数组中
        String[][] account = new String[4][2];
        account[0][0]="a";
        account[0][1]="1";
        account[1][0]="b";
        account[1][1]="2";
        account[2][0]="c";
        account[2][1]="3";
        regustery(uname, upassword, account);


    }

    //    把整个注册过程抽取成一个注册方法
    public static boolean regustery(String uname, String upassword, String[][] account) {

        for (int m = 0; m < account.length; m++) {
//拿出数组中的账户，进行比较
            if (uname.equals(account[m][0])) {
                System.out.println("注册账户已经存在");
                break;

            }
        }
//        在这里声明一个变量，来判断网站的注册人数是否达到阀值
        boolean flag = false;
//        声明一个变量，用来确定用户是否注册成功
        boolean uflag = false;
//        在没有重复账户的情况下，注册成功
        for (int m = 0; m < account.length; m++) {
//
            if (account[m][0] == null) {
                account[m][0] = uname;
                account[m][1] = upassword;
                System.out.println("注册账户成功！");
                uflag = true;
                break;
            } else if (m == account.length - 1 && account[m][0] != null) {
                flag = true;

            }


        }
//        达到阀值的时候，网站就不能再注册新用户了

        if (flag) {
            System.out.println("你已经不能注册了，注册的过多了");
        }
        return uflag;

    }
    }