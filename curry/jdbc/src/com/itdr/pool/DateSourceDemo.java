package com.itdr.pool;

import com.itdr.utils.JDBCUtils;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @Author:cty
 * @Date:2019/2/20 8:09
 * @Description:不负自己
 */
public class DateSourceDemo implements DataSource {
    //    创建集合作为连接的池子
    List<Connection> li = new ArrayList<>();

    public DateSourceDemo() {
        for (int i = 0; i < 1; i++) {
            Connection con = null;
            try {
                con = JDBCUtils.c1();
            } catch (Exception e) {
                e.printStackTrace();
            }
            li.add(con);
        }
    }
//    不用的连接我还要重新放回到集合里（回收）

    public void backCon(Connection con) {
        System.out.println("前"+li.size());
        li.add(con);
        System.out.println("hou"+li.size());
    }

    @Override
    public Connection getConnection() throws SQLException {
//        从集合中拿一个连接
        Connection con = li.remove(0);
//        如果集合中没有连接，我就要创建集合放进去
        if (li.size()<1){
            for (int i = 0; i < 1; i++) {
                Connection cons = null;
                try {
                    con = JDBCUtils.c1();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                li.add(cons);
            }

        }

        return con;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
