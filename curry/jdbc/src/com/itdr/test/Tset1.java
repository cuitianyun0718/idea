package com.itdr.test;

import com.itdr.pool.DateSourceDemo;
import com.itdr.utils.JDBCUtils;
import org.junit.Before;
import org.junit.Test;


import java.sql.*;

/**
 * @Author:cty
 * @Date:2019/2/18 9:40
 * @Description:不负自己
 */
public class Tset1 {
    @Test
    public void test1() {


//        为了能够让外界进行访问，把数据变量拿出来
        Connection con = null;
        Statement st = null;
        ResultSet r = null;
        try {
//            注册驱动
            Class.forName("com.mysql.jdbc.Driver");
//            建立连接
            String s1 = "jdbc:mysql://localhost/test1";
            String s2 = "root";
            String s3 = "950718";
            con = DriverManager.getConnection(s1, s2, s3);
//            创建对象
            st = con.createStatement();
//           执行Sql语句
            String sql = "select * from student";
            r = st.executeQuery(sql);
//            处理结果
            while (r.next()) {
                System.out.println(r.getInt("sid") + r.getString("sname") +
                        r.getString("gender") + r.getInt("class_id"));
            }
//


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        释放资源
        finally {
            {
                try {
                    if (r != null) {
                        r.close();
                    }
                    if (st != null) {
                        st.close();
                    }
                    if (con != null) {
                        con.close();
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
//        建立连接

    }

    @Test
    public void testdemo() throws Exception {
        Connection con = JDBCUtils.c1();
        String sql = "insert into student values(null ,'崔天云','男',5 )";
        PreparedStatement ps = con.prepareStatement(sql);
        int row = ps.executeUpdate();
        System.out.println("成功插入" + row + "行");
        JDBCUtils.closeall(con, ps);

    }

    @Test
    public void test2() throws SQLException {

        DateSourceDemo ds = new DateSourceDemo();
        Connection co = ds.getConnection();
        Statement s = co.createStatement();
        ResultSet rs = s.executeQuery("select * from student");
        while (rs.next()) {
            System.out.println(rs.getString(2));

        }
//        ds.backCon(co);

    }


}



