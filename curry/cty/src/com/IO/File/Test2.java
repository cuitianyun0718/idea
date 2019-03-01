package com.IO.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:cty
 * @Date:2019/1/28 10:15
 * @Description:不负自己
 */
public class Test2 {
    public static void main(String[] args) {
        File f = new File("f:\\cty.text");
        boolean ff = false;
        FileOutputStream fff=null;

        try {
            ff = f.createNewFile();
            fff=new FileOutputStream(f);
            String s="中国你好";
            byte[] bs=s.getBytes();
            fff.write(bs);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
