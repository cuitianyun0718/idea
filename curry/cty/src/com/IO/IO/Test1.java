package com.IO.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:cty
 * @Date:2019/1/28 18:52
 * @Description:不负自己
 */
public class Test1 {
//    创建字节输出流操作步骤
//    1，创建字节输出流对象
//    2，写数据
//    3，释放资源
public static void main(String[] args) {
//    要求；我要往一个文本文件中输入一句话

    try {
        FileOutputStream f=new FileOutputStream("f:\\fos.txt");//这个直接在f盘创建了一个fos.txt的文件
        f.write("cty".getBytes());//写了两句话
//        f.write("curry".getBytes());
        f.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

}
}
