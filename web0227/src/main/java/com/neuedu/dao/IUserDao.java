package com.neuedu.dao;

import com.neuedu.pojo.User;

import java.util.List;

/**
 * @Author:cty
 * @Date:2019/3/1 13:41
 * @Description:不负自己
 */
public interface IUserDao {
    public List<User> getUsers();
    public int insert(User user);
    public  int delete(int id);
    public User getUserById(int id);
    public  int update(User user);

}
