package com.example.mariostudio.lyricviewdemo.me.user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.mariostudio.lyricviewdemo.R;
import com.example.mariostudio.lyricviewdemo.me.Contest;
import com.example.mariostudio.lyricviewdemo.me.playlist.GequActivity;
import com.example.mariostudio.lyricviewdemo.me.user.been.Root;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

public class MeActivity extends AppCompatActivity {

    ListView lis;
    public ProgressBar mProgressBar;
    private Context mContext;
    //    private Handler mHandler;
    private FrameLayout mRootFrameLayout;
//    public final int GET_APK_FINISH = 9527;
//
//    private Handler mHandler = new Handler() {
//            @Override
//            public void handleMessage(Message msg) {
//                super.handleMessage(msg);
//                if (msg.what == GET_APK_FINISH) {
//                    dismissProgressBar();
////                    mListViewAdapter.notifyDataSetChanged();
//                }
//            }
//        };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);


        init();
    }

    BaseAdapter basad=null;
    Root jsbeen;

    private void init() {
        mContext = this;
        lis = (ListView) findViewById(R.id.list_me);

        lis.setAdapter(basad=new BaseAdapter() {
            @Override
            public int getCount() {
                return jsbeen==null?0:jsbeen.getPlaylist().size();
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = MeActivity.this.getLayoutInflater().inflate(R.layout.list_item_me, null);

                TextView tv = (TextView) view.findViewById(R.id.list_item_tv);
                tv.setText(jsbeen.getPlaylist().get(position).getName());
                return view;
            }
        });

        lis.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MeActivity.this,GequActivity.class);
                intent.putExtra("id",jsbeen.getPlaylist().get(position).getId());
                startActivity(intent);
            }
        });



        gett();
    }


    /**
     * 获得歌单
     */
    private void gett() {
        showProgressBar();
        String url = Contest.URL_PLAYLIST;
        OkHttpUtils
                .get()
                .url(url)
                .addParams("uid","303438511")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(okhttp3.Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        Gson gson = new Gson();
                        jsbeen = gson.fromJson(response, Root.class);
                        basad.notifyDataSetChanged();
                        dismissProgressBar();
                    }
                });

    }


    /**
     * 在屏幕中间显示风火轮
     */
    private void showProgressBar() {
        mRootFrameLayout = (FrameLayout) findViewById(android.R.id.content);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams
                (FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.CENTER;
        mProgressBar = new ProgressBar(mContext);
        mProgressBar.setLayoutParams(layoutParams);
        mProgressBar.setVisibility(View.VISIBLE);
        mRootFrameLayout.addView(mProgressBar);
    }

    /**
     * 隐藏风火轮
     */
    private void dismissProgressBar() {
        if (null != mProgressBar && null != mRootFrameLayout) {
            mRootFrameLayout.removeView(mProgressBar);
        }
    }


}
