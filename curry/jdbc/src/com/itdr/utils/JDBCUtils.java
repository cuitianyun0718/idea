package com.itdr.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @Author:cty
 * @Date:2019/2/18 14:15
 * @Description:不负自己
 */
public class JDBCUtils {
//    创建私有变量接受参数
    private static String drivers;
    private static String s1;
    private  static  String s2;
    private  static  String s3;
    private static Connection con;
//    通过静态代码块
    static {
        Properties pe=new Properties();
         InputStream in=JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            pe.load(in);
           drivers= pe.getProperty("driver");
           s1= pe.getProperty("url");
           s2= pe.getProperty("user");
           s3= pe.getProperty("password");
           Class.forName(drivers);
           con=DriverManager.getConnection(s1,s2,s3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static Connection c1() throws Exception {
//        注册驱动
//        Class.forName(" ");
//        Connection con = null;
//
//        con = DriverManager.getConnection(s1, s2, s3);
        return con;
    }

    //    关闭资源的方法
    public static void closeall(Connection con, PreparedStatement ps) {

            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                if (con != null){
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }
            }

        }
    }




