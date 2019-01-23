package com.Lianxi;

/**
 * @Author:cty
 * @Date:2019/1/21 8:51
 * @Description:不负自己
 */
public class Student {
    String names[]=new String[5];
    public void AddName(String name){
        for (int i = 0; i <name.length() ; i++) {
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }
    public void ShowName(){

    }
    public void Update(){

    }
}
