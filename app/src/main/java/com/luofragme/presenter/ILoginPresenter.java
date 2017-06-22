package com.luofragme.presenter;

/**
 * Created by Administrator on 2017/6/16.
 */

public interface ILoginPresenter {
    void clear();
    void doLogin(String name,String password);
    void setProgressBarVisibility(int visibility);
    void onDestory();
}
