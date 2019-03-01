package com.IO.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:cty
 * @Date:2019/1/28 19:16
 * @Description:不负自己
 */
public class Test2 {

public static void main(String[] args) {
    try {
        FileOutputStream f=new FileOutputStream("f:\\fos2.txt");
//        f.write(98);//写一个字节
//        f.write(65);
//        byte[] b={97,98,99,100,101};//写一个字节数组
//        f.write(b);
        byte[] b={97,98,99,100,101};
        f.write(b,1,2);//写一个字节数组的一部分，从第二个开始写，写两个
//   \r\n代表换行
        f.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
