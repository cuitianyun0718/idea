package com.itdr.test;

/**
 * @Author:cty
 * @Date:2019/2/28 8:26
 * @Description:不负自己
 */
public class Orders {
    private Integer id;
    private String uname;
    private String oid;

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

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", oid='" + oid + '\'' +
                '}';
    }
}
