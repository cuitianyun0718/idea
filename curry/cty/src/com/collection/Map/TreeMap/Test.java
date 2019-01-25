package com.collection.Map.TreeMap;

import java.util.Set;
import java.util.TreeMap;

/**
 * @Author:cty
 * @Date:2019/1/24 18:56
 * @Description:不负自己
 */
public class Test {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<String, String>();
        tm.put("hello", "你好");
        tm.put("wodld", "世界");
        tm.put("java", "渣蛙");
        tm.put("wodld", "世界你好");
//        遍历集合
        Set<String> set = tm.keySet();
        for (String S : set) {
            String V = tm.get(S);
            System.out.println(S + " " + V);
        }
    }
}