package com.luofragme.yilaidaozi;

/**
 * Created by Administrator on 2017/7/19.
 */

public class MediaFile implements IMediaFile {
    private String mediaFileStr;
    public MediaFile(String mediaFileStr){
        this.mediaFileStr=mediaFileStr;
    }
    @Override
    public String FilePath() {
        return this.mediaFileStr;
    }
}
