package com.example.mariostudio.lyricviewdemo.me.playlist.been;

import java.util.List;

public class Artists {
    private String name;

    private int id;

    private int picId;

    private int img1v1Id;

    private String briefDesc;

    private String picUrl;

    private String img1v1Url;

    private int albumSize;

    private List<String> alias ;

    private String trans;

    private int musicSize;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setPicId(int picId){
        this.picId = picId;
    }
    public int getPicId(){
        return this.picId;
    }
    public void setImg1v1Id(int img1v1Id){
        this.img1v1Id = img1v1Id;
    }
    public int getImg1v1Id(){
        return this.img1v1Id;
    }
    public void setBriefDesc(String briefDesc){
        this.briefDesc = briefDesc;
    }
    public String getBriefDesc(){
        return this.briefDesc;
    }
    public void setPicUrl(String picUrl){
        this.picUrl = picUrl;
    }
    public String getPicUrl(){
        return this.picUrl;
    }
    public void setImg1v1Url(String img1v1Url){
        this.img1v1Url = img1v1Url;
    }
    public String getImg1v1Url(){
        return this.img1v1Url;
    }
    public void setAlbumSize(int albumSize){
        this.albumSize = albumSize;
    }
    public int getAlbumSize(){
        return this.albumSize;
    }
    public void setAlias(List<String> alias){
        this.alias = alias;
    }
    public List<String> getAlias(){
        return this.alias;
    }
    public void setTrans(String trans){
        this.trans = trans;
    }
    public String getTrans(){
        return this.trans;
    }
    public void setMusicSize(int musicSize){
        this.musicSize = musicSize;
    }
    public int getMusicSize(){
        return this.musicSize;
    }

}