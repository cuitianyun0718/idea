package com.itdr.service.qiantai;

import com.itdr.domain.User;

/**
 * @Author:cty
 * @Date:2019/1/30 18:38
 * @Description:不负自己
 */
public interface UserService {
//    定义规则的过程

//    用户登录
    boolean login(String unamem,String pssword);

    boolean register(String uname, String password);

   User show(String uname);
}
