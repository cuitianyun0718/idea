package com.itdr.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author:cty
 * @Date:2019/2/20 18:07
 * @Description:不负自己
 */
public class C3p0Util {
    public static void main(String[] args) {


        try {
            cpd.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  public static   ComboPooledDataSource cpd;

    static {
       cpd= new ComboPooledDataSource();
    }
    public static Connection c1() throws Exception {
//        注册驱动
//        Class.forName(" ");
//        Connection con = null;
//
//        con = DriverManager.getConnection(s1, s2, s3);
        return cpd.getConnection();
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
