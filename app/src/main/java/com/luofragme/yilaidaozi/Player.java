package com.luofragme.yilaidaozi;

import android.util.Log;

import java.util.ResourceBundle;

/**
 * Created by Administrator on 2017/7/19.
 */

public class Player implements IPlayer {
    @Override
    public void play(IMediaFile iMediaFile) {
       String  filePath = iMediaFile.FilePath();
        Log.d("player","iMediaFile  is ok "+filePath);
    }
}
