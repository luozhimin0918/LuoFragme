package com.luofragme;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobUser;

/**
 * Created by Administrator on 2017/6/9.
 */

public class MyUser extends BmobUser {

    private  Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer Age) {
        this.age = Age;
    }
}
