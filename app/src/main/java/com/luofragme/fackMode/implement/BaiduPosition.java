package com.luofragme.fackMode.implement;

import com.luofragme.fackMode.Location;

/**
 * Created by Administrator on 2017/6/20.
 */

public class BaiduPosition implements Location {
    @Override
    public void getPostion() {
        System.out.println("百度位置。。。。");
    }

    @Override
    public void getCityName(long lag, long lng) {
        System.out.println("百度定位 当前城市是XXX");
    }
}
