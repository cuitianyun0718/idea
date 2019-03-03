package com.neuedu.service;

import com.neuedu.pojo.User;

import java.util.List;

/**
 * @Author:cty
 * @Date:2019/3/1 16:33
 * @Description:不负自己
 */
public interface IUserService {
    public List<User> getUsers();
    public int insert(User user);
    public int delete (int id);
    public User getUserById(int id);
    public  int update(User user);
}
