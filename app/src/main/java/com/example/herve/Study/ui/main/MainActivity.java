package com.example.herve.Study.ui.main;

import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import com.example.bannerlibrary.Banner;
import com.example.bannerlibrary.BannerPagerAdapter;
import com.example.herve.Study.R;
import com.example.herve.Study.base.ui.BaseActivity;
import com.example.herve.Study.ui.home.HomeActivity;
import com.example.herve.Study.ui.main.adapter.WelComeAdapter;

import java.util.ArrayList;

import butterknife.BindView;

public class MainActivity extends BaseActivity {


    @BindView(R.id.banner_main)
    Banner bannerMain;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;

    @Override
    protected int initLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void findViewById() {

    }

    @Override
    protected void initView() {
        fullScreen();
    }

    @Override
    protected void initData() {

        final ArrayList<String> data = new ArrayList<>();
        data.add("01");
        data.add("02");
        WelComeAdapter adapter = new WelComeAdapter(mContext, data);

        bannerMain.setDot(R.drawable.btn_radio_on_disabled_holo_dark, R.drawable.btn_radio_on_holo_dark)
                .setDotGravity(Banner.CENTER).
                setAdapter(adapter).
                setOnItemClickListener(new BannerPagerAdapter.onItemClickListener() {
                    @Override
                    public void onClick(int position) {
                        if(position==data.size()-1){
                            Intent intent=new Intent(mContext, HomeActivity.class);
                            startActivity(intent);

                        }
                    }
                })
                .stopAutoPlay();

    }

    @Override
    protected void initListener() {

    }

    private void fullScreen() {
        getWindow().findViewById(Window.ID_ANDROID_CONTENT).setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }
}
