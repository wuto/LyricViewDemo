package com.example.mariostudio.lyricviewdemo.me;

/**
 * Created by fantasee on 2017/1/4.
 */
public class Contest {

    private static final String BASE_URL = "http://music.163.com/api/";

    //取用户所有歌单  http://music.163.com/api/user/playlist/?offset=0&limit=1001&uid=用户ID
    public static final String URL_PLAYLIST = BASE_URL+"user/playlist/?offset=0&limit=1001";

    //取歌单详细信息  http://music.163.com/api/playlist/detail?id=歌单ID
    public static final String URL_PLAYLIST_DETAIL =BASE_URL+ "playlist/detail";

    //取歌词  http://music.163.com/api/song/media?id=音乐ID
    public static final String URL_SONG_MEDIA= "song/media";

    //取音乐详细信息  http://music.163.com/api/song/detail/?id=音乐ID&ids=[音乐ID]
    public static final String URL_SONG_DETAIL ="song/detail";

}
