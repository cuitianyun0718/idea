package com.itdr.service.qiantai;

import com.itdr.data.UserData;
import com.itdr.data.UserDataImp;
import com.itdr.domain.User;

/**
 * @Author:cty
 * @Date:2019/1/30 18:48
 * @Description:不负自己
 */
public class UserServiceImp implements UserService {

    //导入数据层
    private UserData ud = new UserDataImp();

    //用户登录业务
    @Override
    public boolean login(String uname, String password) {
        boolean flag = false;

        //参数校验
        if (uname == null || uname.equals("") || uname.equals("null")) {
            return flag;
        }

        //1.将获取的数据去数据库中比对
        flag = ud.selectOne(uname);
        //2.存在就成功，不存在就失败
        return flag;
    }

    @Override
    public boolean register(String uname, String password) {
        return false;
    }


    //用户注册业务

    public boolean regis(String uname, String password) {
        boolean flagq = false;

        //参数校验
        if (uname == null || uname.equals("") || uname.equals("null")) {
            return flagq;
        }

        //1.将获取的数据去数据库中比对,看有没有重复的
        boolean flag = ud.selectOne(uname);
        //2.如果存在，就注册失败，否则就可以注册，就要把数据放到数据库里
        if (!flag) {
            User u = new User();
            u.setUname(uname);
            u.setUpassword(password);
            flagq = ud.add(u);
        }
        return flagq;
    }

    @Override
    public User show(String uname) {
        User u = null;


        //参数校验
        if (uname == null || uname.equals("") || uname.equals("null")) {
            return u;
        }

        //1.通过用户名去数据库中查这个用户的信息
        u = ud.selectOneUser(uname);

        return u;
    }
}