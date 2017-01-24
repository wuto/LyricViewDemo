package com.example.mariostudio.lyricviewdemo.me.user.been;

import java.util.List;

public class Root {
    private boolean more;

    private List<Playlist> playlist ;

    private int code;

    public void setMore(boolean more){
        this.more = more;
    }
    public boolean getMore(){
        return this.more;
    }
    public void setPlaylist(List<Playlist> playlist){
        this.playlist = playlist;
    }
    public List<Playlist> getPlaylist(){
        return this.playlist;
    }
    public void setCode(int code){
        this.code = code;
    }
    public int getCode(){
        return this.code;
    }

}