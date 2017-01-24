package com.example.mariostudio.lyricviewdemo.me.playlist.been;

import java.util.List;

public class Album {
    private String name;

    private int id;

    private String type;

    private int size;

    private long picId;

    private String blurPicUrl;

    private int companyId;

    private long pic;

    private String picUrl;

    private long publishTime;

    private String description;

    private String tags;

    private String company;

    private String briefDesc;

    private Artist artist;

    private List<String> songs;

    private List<String> alias;

    private int status;

    private int copyrightId;

    private String commentThreadId;

    private List<Artists> artists;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void setPicId(long picId) {
        this.picId = picId;
    }

    public long getPicId() {
        return this.picId;
    }

    public void setBlurPicUrl(String blurPicUrl) {
        this.blurPicUrl = blurPicUrl;
    }

    public String getBlurPicUrl() {
        return this.blurPicUrl;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getCompanyId() {
        return this.companyId;
    }

    public void setPic(long pic) {
        this.pic = pic;
    }

    public long getPic() {
        return this.pic;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public long getPublishTime() {
        return this.publishTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTags() {
        return this.tags;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public String getBriefDesc() {
        return this.briefDesc;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    public List<String> getSongs() {
        return this.songs;
    }

    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    public List<String> getAlias() {
        return this.alias;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public void setCopyrightId(int copyrightId) {
        this.copyrightId = copyrightId;
    }

    public int getCopyrightId() {
        return this.copyrightId;
    }

    public void setCommentThreadId(String commentThreadId) {
        this.commentThreadId = commentThreadId;
    }

    public String getCommentThreadId() {
        return this.commentThreadId;
    }

    public void setArtists(List<Artists> artists) {
        this.artists = artists;
    }

    public List<Artists> getArtists() {
        return this.artists;
    }

}