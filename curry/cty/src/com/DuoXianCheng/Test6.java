package com.DuoXianCheng;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:cty
 * @Date:2019/1/30 9:24
 * @Description:不负自己
 */
public class Test6 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++) {

            try {
                FileOutputStream f = new FileOutputStream("f:\\cty.txt");//创建一个文件
                f.write("以后不写日志的把java格式写10遍".getBytes());//往文件里写一段话
                f.close();
//

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
