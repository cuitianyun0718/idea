package com.itdr.domain;

/**
 * @Author:cty
 * @Date:2019/1/30 21:49
 * @Description:不负自己
 */
public class Product {
    //商品属性
    private int id;
    private String pname;
    private int pricse;
    private String xq;
    private int sx=1;//商品上下架。默认为1
    private  int hot;//商品是否热卖，默认为0

    public int getSx() {
        return sx;
    }

    public void setSx(int sx) {
        this.sx = sx;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPricse() {
        return pricse;
    }

    public void setPricse(int pricse) {
        this.pricse = pricse;
    }

    public String getXq() {
        return xq;
    }

    public void setXq(String xq) {
        this.xq = xq;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", pricse=" + pricse +
                ", xq='" + xq + '\'' +
                '}';
    }
}
