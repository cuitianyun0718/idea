package com.neuedu.pojo;

import lombok.Data;

import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @Author:cty
 * @Date:2019/2/27 18:26
 * @Description:不负自己
 */
@Data
public class User {
private Integer id;
private String uname;
private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
