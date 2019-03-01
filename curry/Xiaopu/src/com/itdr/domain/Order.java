package com.itdr.domain;
import java.util.Arrays;

/**
 * @Author:cty
 * @Date:2019/2/19 18:23
 * @Description:不负自己
 */
public class Order {
    //序号
    private int id;
    //用户账户
    private String uname;
    //订单号
    private String oid;
    //购物详情
    private Cart[] carts;
    //购物总价
    private double numPrice;
    //日期
    private String date;


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Cart[] getCarts() {
        return carts;
    }

    public void setCarts(Cart[] carts) {
        this.carts = carts;
    }

    public double getNumPrice() {
        return numPrice;
    }

    public void setNumPrice(double numPrice) {
        this.numPrice = numPrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", oid='" + oid + '\'' +
                ", carts=" + Arrays.toString(carts) +
                ", numPrice=" + numPrice +
                ", data='" + date + '\'' +
                '}';
    }
}
