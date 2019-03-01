package com.IO.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:cty
 * @Date:2019/1/28 19:27
 * @Description:不负自己
 */
public class Test3 {
//    字节输入流操作步骤
//    1，创建字节输入流对象
//    2，调用read（）方法读取数据，并把数据显示在控制台
//    3，释放资源
//    读取数据的方法
//    A:int read():一次读取一个字节
//    B:int read():一次读取一个字节数组
public static void main(String[] args) {
    try {
        FileInputStream f=new FileInputStream("f:\\fos.txt");
        int by=0;
        while ((by=f.read())!=-1) {
            System.out.println((char) by);
//            f.close();
        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    catch (IOException e ) {
        e.printStackTrace();
    }


}
}
