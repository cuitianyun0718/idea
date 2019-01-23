package com.homework;

public class Demo10 {
    public static void main(String[]args){
//        10、搬砖问题：36块砖，36人搬，男人搬4块，女人搬3块，两个小孩抬1块。要求一次搬完，问需要男人、女人、小孩各几人？
        for(int x=0;x<=9;x++){
            for(int y=0;y<=12;y++){
                for(int z=0;z<=36;z+=2){
                    if(4*x+3*y+0.5*z==36&&x+y+z==36)
                    System.out.println("男人有"+x+","+"女人有"+y+","+"小孩有"+z);
                }
            }
        }



    }
}
