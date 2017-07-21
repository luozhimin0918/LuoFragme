package com.luofragme.yilaidaozi;

/**
 * Created by Administrator on 2017/7/19.
 */

public class OperationMain {
    public void PlayMedia(){

         IMediaFile  iMediaFile=new MediaFile("jjj.mp4");
         IPlayer  iPlayer=new Player();
        iPlayer.play(iMediaFile);
    }
}
