package com.collection.Map.LinkedHashMap;

import java.util.LinkedHashMap;

import java.util.Set;

/**
 * @Author:cty
 * @Date:2019/1/24 18:14
 * @Description:不负自己
 */
public class Test1 {
//   LinkedHashMap 的练习
public static void main(String[] args) {
//    创建集合对象
    LinkedHashMap<String,String> hm=new LinkedHashMap<String, String>();
//    创建并添加元素
    hm.put("234","cty");
    hm.put("123","curry");
    hm.put("567","james");
//    遍历
    Set<String> s= hm.keySet();

    for (String k:s){
        String v=hm.get(k);
        System.out.println(k+" "+v);
    }

}
}
