package com.luofragme.fackMode.implement;

import com.luofragme.fackMode.Location;

/**
 * Created by Administrator on 2017/6/20.
 */

public class Utils {

    /**
     * 根据参数确定使用哪家定位
     * @param locaType
     * @return
     */
    public  static Location getLocation(String  locaType){
         if(locaType.equals("baidu")){
             return new BaiduPosition();
         }else{
             return  new XiaoMiPosition();
         }
    }
}
