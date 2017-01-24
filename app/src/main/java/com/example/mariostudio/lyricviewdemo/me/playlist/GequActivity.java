package com.example.mariostudio.lyricviewdemo.me.playlist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
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
import com.example.mariostudio.lyricviewdemo.me.playlist.been.Root;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

public class GequActivity extends AppCompatActivity {


    ListView gequ;

    private FrameLayout mRootFrameLayout;
    private Context mContext;
    public ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gequ);

        init();

    }

    BaseAdapter basad;

    private void init() {
        mContext = this;
        gequ = (ListView) findViewById(R.id.gequ_listview);
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", -1);
        ListView gequ_listview = (ListView) findViewById(R.id.gequ_listview);
        gequ_listview.setAdapter(basad = new BaseAdapter() {
            @Override
            public int getCount() {
                return root == null ? 0 : root.getResult().getTracks().size();
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
                View view = GequActivity.this.getLayoutInflater().inflate(R.layout.list_item_playlist, null);

                TextView tv = (TextView) view.findViewById(R.id.list_item_tv);
                TextView item_position = (TextView) view.findViewById(R.id.item_position);
                TextView item_artists = (TextView) view.findViewById(R.id.item_artists);

                String _al=root.getResult().getTracks().get(position).getAlbum().getName();
                if(!TextUtils.isEmpty(_al)){
                    _al="-"+_al;
                }else{
                    _al="";
                }
                item_artists.setText(root.getResult().getTracks().get(position).getArtists().get(0).getName() +_al );
                item_position.setText(position + 1 + "");
                tv.setText(root.getResult().getTracks().get(position).getName());
                return view;
            }
        });

        gequ_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(GequActivity.this, GequActivity.class);
//                intent.putExtra("id", root.getResult().getTracks().get(position).getId());
//                startActivity(intent);
            }
        });


        gett(id);

    }

    Root root;

    private void gett(int id) {
        showProgressBar();
        String url = Contest.URL_PLAYLIST_DETAIL;
        OkHttpUtils
                .get()
                .url(url)
                .addParams("id", id + "")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(okhttp3.Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        Gson gson = new Gson();
                        root = gson.fromJson(response, Root.class);
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
