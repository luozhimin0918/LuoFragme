package com.luofragme.design.SingleMode;

/**
 * Created by Administrator on 2017/6/21.
 */

public class SingleModeTwo {
    private  static SingleModeTwo singleModeTwo;
    private SingleModeTwo(){

    }
    public  static  SingleModeTwo getInstance() {

        if (singleModeTwo == null) {
            synchronized (singleModeTwo) {
                singleModeTwo = new SingleModeTwo();
            }

        }
        return singleModeTwo;
    }

}
