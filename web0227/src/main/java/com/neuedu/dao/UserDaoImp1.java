package com.neuedu.dao;

import com.neuedu.pojo.User;
import com.neuedu.utils.JDBCUtil;
import com.neuedu.utils.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author:cty
 * @Date:2019/3/1 13:44
 * @Description:不负自己
 */
public class UserDaoImp1 implements IUserDao {
    @Override
    public List<User> getUsers() {
        return JDBCUtil.executeQuery("select * from user",new RowMap<User>() {
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
            },null);

}
