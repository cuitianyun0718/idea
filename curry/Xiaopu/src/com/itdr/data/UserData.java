package com.itdr.data;

import com.itdr.domain.User;

/**
 * @Author:cty
 * @Date:2019/1/30 18:54
 * @Description:不负自己
 */
public interface UserData {

//    对数据库进行增删改查
    boolean add(User u);

    void deleteOne(String uname);//删除一个用户

    void changeOne (String uname);//修改一个用户

    boolean selectOne(String uname);//查看一个人用户信息

    User selectOneUser(String uname);//

    void selectAll();

}
