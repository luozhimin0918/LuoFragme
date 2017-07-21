package com.luofragme.yilaidaozi;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by Administrator on 2017/7/19.
 */

public class Xiaolongnv implements Dating {
    private String name;

    public Xiaolongnv(){

    }
    public Xiaolongnv(String useName){
        this.name=useName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void dating() {
        if(!TextUtils.isEmpty(this.name)){
            Log.d("DatingXX",this.name+" 16nia xxxx");
        }else {
            Log.d("DatingXX"," 16nia xxxx");
        }
    }
}
