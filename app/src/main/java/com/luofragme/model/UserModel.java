package com.luofragme.model;

/**
 * Created by Administrator on 2017/6/16.
 */

public class UserModel implements IUser {
    String name ;
    String pass;

    public UserModel(String name,String pass){
        this.name=name;
        this.pass=pass;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPass() {
        return this.pass;
    }

    @Override
    public int checkUserValidity(String name, String pass) {
        if (name==null||pass==null||!name.equals(getName())||!pass.equals(getPass())){
            return -1;
        }
        return 0;
    }
}
