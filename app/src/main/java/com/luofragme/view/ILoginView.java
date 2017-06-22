package com.luofragme.view;

/**
 * Created by Administrator on 2017/6/16.
 */

public interface ILoginView {
    public void  clear();
    public void onLoginResult(Boolean isLogin,int code);
    public void setProgressBarVisibility(int visibility );
}
