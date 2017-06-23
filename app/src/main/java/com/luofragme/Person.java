package com.luofragme;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2017/6/9.
 */

public class Person extends BmobObject {
    private String name;
    private String address;
    private  Integer pAge;
    private DataPer dataPer;

    public DataPer getDataPer() {
        return dataPer;
    }

    public Integer getpAge() {
        return pAge;
    }

    public void setpAge(Integer pAge) {
        this.pAge = pAge;
    }

    public void setDataPer(DataPer dataPer) {
        this.dataPer = dataPer;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
