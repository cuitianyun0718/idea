package com.IO.File;

import java.io.File;

/**
 * @Author:cty
 * @Date:2019/1/24 15:08
 * @Description:不负自己
 */
public class Test1 {
    public static void main(String[] args)  {
//        封装e判断目录
        File a=new File("e:\\");
        /* 获取该目录下所有文件或者文件夹的File数组 */
        File [] f=a.listFiles();
//        遍历
        for(File F:f){
            if (F.isFile()){
                if (F.getName().endsWith(".jpg")){
                    System.out.println(F.getName());
                }
            }
        }

    }
}
