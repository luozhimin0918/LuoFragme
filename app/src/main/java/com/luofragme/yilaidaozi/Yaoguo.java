package com.luofragme.yilaidaozi;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by Administrator on 2017/7/19.
 */

public class Yaoguo implements Dating {
    private String name;

    public Yaoguo(){

    }
    public Yaoguo(String useName){
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
            Log.d("Dating",this.name+" 16nia xxxx");
        }else {
            Log.d("Dating"," 16nia xxxx");
        }
    }
}
