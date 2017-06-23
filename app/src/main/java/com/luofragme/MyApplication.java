package com.luofragme;

import android.app.Application;

import com.socks.library.KLog;

/**
 * Created by Administrator on 2017/6/22.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        KLog.init(BuildConfig.DEBUG); //开启klog   通过LOG_DEBUG来确定是否打印log
    }
}
