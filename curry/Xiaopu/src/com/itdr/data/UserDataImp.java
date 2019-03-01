package com.itdr.data;

import com.itdr.domain.User;

import java.util.ArrayList;

/**
 * @Author:cty
 * @Date:2019/1/30 18:54
 * @Description:不负自己
 */
public class UserDataImp implements UserData {
    //     我这里有数据库
    private static ArrayList<User> uli = new CommonDataImp().getUserDataJH();

    @Override
    public boolean add(User u) {
       return uli.add(u);
    }

    @Override
    public void deleteOne(String uname) {

    }

    @Override
    public void changeOne(String uname) {

    }

    @Override
    public boolean selectOne(String uname) {
//        我要在这里去用户的数据库中查找有没有这个用户
        boolean b = false;
        for (User user : uli
                ) {
            if (uname.equals(user.getUname())) {
                b = true;
            }

        }
        return b;

    }

    @Override
    public User selectOneUser(String uname) {
//        我要在这里去用户的数据库中查找有没有这个用户
       User u = null;
        for (User user : uli
                ) {
            if (uname.equals(user.getUname())) {
                u = user;

            }

        }
        return u;

    }

    @Override
    public void selectAll() {

    }
}
