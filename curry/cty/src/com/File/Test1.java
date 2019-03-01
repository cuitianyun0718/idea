package com.File;

import java.io.*;

/**
 * @Author:cty
 * @Date:2019/1/24 19:53
 * @Description:不负自己
 */
public class Test1 {
    //    1，字节流和字符流
//    2，那个文件
//    在java中用什么接受
//    查看接受内容
//    关闭流
    public static void main(String[] args) throws IOException {
//        字节流的输入流（就是读取文件的数据）
        File f = new File("f:\\text.txt");
//        InputStream is = null;
//        InputStream  is = new FileInputStream(f);
//        byte b[] = new byte[(int) f.length()];
//        int a = is.read(b);
//        System.out.println(new String(b));
////        System.out.println(a);
//        is.close();


//        字节流的输出流(就是往数据里在添加一些数据)
//        File f = new File("f:\\text.txt");
        OutputStream os=new FileOutputStream(f,true);
        String s="fgjhgjkxhfjhd的罚款缴纳";
        os.write(s.getBytes());
        os.close();

//        字符流的输入
//        File f = new File("f:\\text.txt");
//        Reader r = new FileReader(f);
//        char[] c = new char[1024];
//        r.read(c);
//        System.out.println(new String(c));
//        r.close();

//        字符流的输出
//
////        File f = new File("f:\\text.txt");
//        Writer w=null;
//         w=new FileWriter(f,true);
//        w.write("woainicuiqi");
//        w.close();


//        读多行数据（缓冲流）

//        Reader r = null;
//        r = new FileReader(f);
//        BufferedReader b = new BufferedReader(r);
//
//        String s = b.readLine();
//        while (s != null) {
//            System.out.println(s);
//            s = b.readLine();

//
//        Writer w = null;
//        w = new FileWriter(f);
//        BufferedWriter b = null;
//        b = new BufferedWriter(w);
//
//        b.write("fjngjkd");
//        b.newLine();
//
//        PrintWriter p = new PrintWriter(w);


//        File file = new File("f:\\demo");
//        System.out.println("mkdir:" + file.mkdir());//这是创建一个文件夹
//        File file2 = new File("f:\\demo\\a.txt");
//        System.out.println("createNewFile:" + file2.createNewFile());//这是在已经有的文件中创建一个文件
    }


}