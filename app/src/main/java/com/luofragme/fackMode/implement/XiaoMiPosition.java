package com.luofragme.fackMode.implement;

import com.luofragme.fackMode.Location;

/**
 * Created by Administrator on 2017/6/20.
 */

public class XiaoMiPosition implements Location {
    @Override
    public void getPostion() {
        System.out.println("小米地图位置");
    }

    @Override
    public void getCityName(long lag, long lng) {
        System.out.println("小米定位 当前城市是XXXX");
    }
}
