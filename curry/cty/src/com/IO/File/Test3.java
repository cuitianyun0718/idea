package com.IO.File;

import java.io.File;
import java.io.IOException;

/**
 * @Author:cty
 * @Date:2019/1/25 18:56
 * @Description:不负自己
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
//        首先在盘中创建一个文件夹
//        File f1 = new File("f:\\demo");
//        System.out.println(f1.mkdir());
//       在刚才建的文件夹中创建一个文件
//        File f2 = new File("f:\\demo\\cty.jpg");
//        System.out.println(f2.createNewFile());
//      File f3 = new File("f:\\test\\curry\\james\\cty");
//      System.out.println(f3.mkdirs());
//        File f4 = new File("f:\\123");
//        System.out.println(f4.delete());//万一一个文件夹里还有文件，删除第一个会不成功的
//
        File f1 = new File("e:\\deee.jpg");
        File F2=new File("f:\\dsss.jpg");
        System.out.println(f1.renameTo(F2));

    }

}
