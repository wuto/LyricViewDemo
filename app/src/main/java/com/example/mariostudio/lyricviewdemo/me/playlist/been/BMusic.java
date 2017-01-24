package com.example.mariostudio.lyricviewdemo.me.playlist.been;

public class BMusic {
    private String name;

    private long id;

    private long size;

    private String extension;

    private int sr;

    private long dfsId;

    private int bitrate;

    private long playTime;

    private double volumeDelta;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return this.id;
    }
    public void setSize(long size){
        this.size = size;
    }
    public long getSize(){
        return this.size;
    }
    public void setExtension(String extension){
        this.extension = extension;
    }
    public String getExtension(){
        return this.extension;
    }
    public void setSr(int sr){
        this.sr = sr;
    }
    public int getSr(){
        return this.sr;
    }
    public void setDfsId(long dfsId){
        this.dfsId = dfsId;
    }
    public long getDfsId(){
        return this.dfsId;
    }
    public void setBitrate(int bitrate){
        this.bitrate = bitrate;
    }
    public int getBitrate(){
        return this.bitrate;
    }
    public void setPlayTime(long playTime){
        this.playTime = playTime;
    }
    public long getPlayTime(){
        return this.playTime;
    }
    public void setVolumeDelta(double volumeDelta){
        this.volumeDelta = volumeDelta;
    }
    public double getVolumeDelta(){
        return this.volumeDelta;
    }

}