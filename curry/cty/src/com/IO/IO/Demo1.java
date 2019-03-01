package com.IO.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:cty
 * @Date:2019/1/29 9:16
 * @Description:不负自己
 */
public class Demo1 {
    public static void main(String[] args) {
        FileOutputStream f= null;
        try {
            f = new FileOutputStream("f:\\.foss.txt");
            f.write("cty".getBytes());//往里面写了一句话
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
