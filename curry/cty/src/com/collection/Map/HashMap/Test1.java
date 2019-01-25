package com.collection.Map.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author:cty
 * @Date:2019/1/24 8:35
 * @Description:不负自己
 */
public class Test1 {
//    获取功能
//    V get(Object key):根据键获取值
//  Set<K> keySet():获取集合中所有键的集合
// Collection<V> values():获取集合中所有值的集合

    public static void main(String[] args) {

//        创建集合对象
        Map<String, String> m = new HashMap<String, String>();
//       创建元素并且添加元素
        m.put("邓超","孙俪");
        m.put("杨过","小龙女");
        m.put("男朋友","女朋友");
        m.put("邓超","孙俪li");
////        根据键获取值
////        v get (object key)
        System.out.println(m.get("杨过"));
        System.out.println(m.get("邓超"));
        System.out.println(m.get("邓"));
        System.out.println("========================");
        System.out.println(m);
//
////        获取所有键(男)的集合
      Set<String> o= m.keySet();
        for (String s1 :o) {
            System.out.println(s1);

        }
        System.out.println("====================");
//            获取所有值（女）的集合
            Collection<String> c=m.values();
            for (String s:c){
                System.out.println(s);
            }
            System.out.println("==================");
//            获取所有键值对的集合，

            Set<Map.Entry<String, String>> s=m.entrySet();
//            遍历键值对对象的集合，得到每一个键值对对象
            for (Map.Entry<String, String> e:s){
                String s2=e.getKey();
                String s3=e.getValue();
                System.out.println(s2+" "+s3);


            }



        }

}