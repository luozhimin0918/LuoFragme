package com.luofragme.model;

/**
 * Created by Administrator on 2017/6/16.
 */

public interface IUser {
     String getName();
     String getPass();
     int  checkUserValidity(String name ,String pass);
}
