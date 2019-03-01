package com.itdr.test;

import com.itdr.utils.RowMap;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:cty
 * @Date:2019/2/27 13:38
 * @Description:不负自己
 */
public class Test {
    private static final String URL = "jdbc:mysql://localhost/test";
    private static final String USER = "root";
    private static final String PWD = "950718";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //    获取一个连接方法
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PWD);
//

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

public  static int add(){
        int result=0;
        Connection conn=  getConnection();

        String sql="insert into user(uname,password) values(?,?)";
        try {
            PreparedStatement pstmt= conn.prepareStatement(sql);
            pstmt.setString(1,"gwk");
            pstmt.setString(2,"cqcqcq");
            result= pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }

    public  static int update(){
        int result=0;
        Connection conn=  getConnection();

        String sql="update user set uname=? where id=8";
        try {
            PreparedStatement pstmt= conn.prepareStatement(sql);
            pstmt.setString(1,"lgwk");
//            pstmt.setString(1,"8888");
            result= pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }
    public static int executeUpdate(String sql,Object... objs){
        int result=0;
        Connection conn=  getConnection();
        PreparedStatement pstmt=null;
        try {
          pstmt=  conn.prepareStatement(sql);
          if (objs!=null){
              for (int i=0;i<objs.length;i++){
                  pstmt.setObject(i+1,objs[i]);
              }
          }
         result= pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
return result;
    }




    public static <T> List<T> executeQuery(String sql, RowMap<T> rm, Object... obj){
        List<T> lists = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        conn=getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
            if(obj!=null){
                for(int i=0;i<obj.length;i++){
                    pstmt.setObject(i+1,obj[i]);
                }
            }
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                T t = rm.Rowmapping(rs);
                lists.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lists;
    }

    public static void main(String[] args) {
//        System.out.println(  add());
//        System.out.println(update());
//        System.out.println( executeUpdate("delete from user where id=?",8));
//        System.out.println( executeUpdate("update user set uname=? where id=?",123,13));
        List<User> list=executeQuery("select * from user", new RowMap<User>() {
                    @Override
                    public User Rowmapping(ResultSet rs) {
                        User u=new User();
                        try {
                            u.setId(rs.getInt("id"));
                            u.setUname(rs.getString("uname"));
                            u.setPassword(rs.getString("password"));
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        return u;
            }
        }, null);
        for (User u:list
             ) {
            System.out.println(u);
        }
    }

//    public static void main(String[] args) {
//        List<Orders> O=executeQuery("select * from orders", new RowMap<Orders>() {
//            @Override
//            public Orders Rowmapping(ResultSet rs) {
//                Orders o=new Orders();
//                try {
//                    o.setId(rs.getInt("id"));
//                    o.setUname(rs.getString("uname"));
//                    o.setOid(rs.getString("oid"));
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//                return o;
//            }
//        }, null);
//        for (Orders o:O
//             ) {
//            System.out.println(o);
//
//        }
//    }
}
