package com.luofragme;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2017/6/22.
 */

public class DataPer  {
    private String newName;
    private int  age;
    public DataPer(){

    }
    public DataPer(String newName,int age){
        this.newName=newName;
        this.age=age;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
