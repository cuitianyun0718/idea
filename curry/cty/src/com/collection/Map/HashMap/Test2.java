package com.collection.Map.HashMap;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author:cty
 * @Date:2019/1/24 12:44
 * @Description:不负自己
 */
public class Test2 {
    public static void main(String[] args) {
//        创建集合对象
        HashMap<Student,String> hm=new HashMap<Student, String>();
//        创建学生对象
        Student s1=new Student();
        s1.setName("貂蝉");
        s1.setPrice("13888");
        Student s2=new Student();
        s2.setName("吕布");
        s2.setPrice("18888");
        Student s3=new Student();
        s3.setName("鲁班");
        s3.setPrice("888");
        Student s4=new Student();
        s4.setName("亚瑟");
        s4.setPrice("免费");
        hm.put(s1,"111");
        hm.put(s2,"222");
        hm.put(s3,"333");
        hm.put(s4,"444");
//        遍历
      Set<Student> s= hm.keySet();
      for (Student key:s){
          String S=hm.get(key);
//          System.out.println(key.getName()+"---"+key.getPrice()+S);
          System.out.println(key.getName()+key.getPrice() +"--"+S);

      }
    }
}
