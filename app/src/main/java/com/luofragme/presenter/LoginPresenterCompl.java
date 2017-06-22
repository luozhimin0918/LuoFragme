package com.luofragme.presenter;

import android.os.Handler;
import android.os.Looper;

import com.luofragme.model.IUser;
import com.luofragme.model.UserModel;
import com.luofragme.view.ILoginView;

/**
 * Created by Administrator on 2017/6/16.
 */

public class LoginPresenterCompl implements ILoginPresenter {
    ILoginView iLoginView;
    IUser user;
    Handler handler;
    public LoginPresenterCompl(ILoginView iLoginView){
        this.iLoginView=iLoginView;
        initUser();
        handler = new Handler(Looper.getMainLooper());
    }

    private void initUser() {
        user=new UserModel("mvp","mvp");
    }

    @Override
    public void clear() {

    }

    @Override
    public void doLogin(String name, String password) {
        Boolean isLoginSuccess = true;
        final int code = user.checkUserValidity(name,password);
        if (code!=0) isLoginSuccess = false;
        final Boolean result = isLoginSuccess;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (iLoginView!=null) {
                    iLoginView.onLoginResult(result, code);
                }
            }
        }, 5000);
    }

    @Override
    public void setProgressBarVisibility(int visibility) {

    }

    @Override
    public void onDestory() {

    }
}
