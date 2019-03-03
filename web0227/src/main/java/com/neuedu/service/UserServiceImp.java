package com.neuedu.service;

import com.neuedu.dao.IUserDao;
import com.neuedu.dao.UserDaoImp1;
import com.neuedu.pojo.User;

import java.util.List;

/**
 * @Author:cty
 * @Date:2019/3/1 16:34
 * @Description:不负自己
 */
public class UserServiceImp implements IUserService {
    IUserDao dao=new UserDaoImp1();
    @Override
    public List<User> getUsers() {
        return dao.getUsers();
    }

    @Override
    public int insert(User user) {
        return dao.insert(user);
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public User getUserById(int id) {
        return dao.getUserById(id);
    }

    @Override
    public int update(User user) {
        return dao.update(user);
    }
}
