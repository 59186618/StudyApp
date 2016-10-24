package com.example.herve.Study.base.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import com.example.herve.Study.utils.sp.SharedPreferencesUtil;
import com.example.herve.Study.utils.sp.SpUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created           :Herve on 2016/9/27.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/9/27
 * @ projectName     :OurSchool
 * @ version
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected Context mContext;
    protected Unbinder mUnbinder;
    private String TAG = getClass().getSimpleName();

    protected abstract int initLayoutId();

    protected abstract void findViewById();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initListener();

    protected SharedPreferencesUtil sharedPreferencesUtil;
    protected SpUtil spUtil;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(initLayoutId());
        mContext = this;
        mUnbinder = ButterKnife.bind(this);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//
//            // Translucent status bar
//
//            getWindow().setFlags(
//
//                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
//
//                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//
//        }


        findViewById();

        initData();

        initView();

        initListener();

    }

    @Override
    protected void onDestroy() {
        mUnbinder.unbind();
        super.onDestroy();
    }

    //获取状态栏的高度
    protected int getstatusBarHeight() {

        return statusBarHeight();
    }


    //获取屏幕的高度
    protected int getScreenHeight() {

        return screenHeight();
    }

    //获取屏幕的宽度
    protected int getScreenWidth() {

        return screenWidth();
    }


    private int statusBarHeight() {
        Rect frame = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
        return frame.top;
    }

    private int screenHeight() {

        return getWindow().getDecorView().getHeight();
    }

    private int screenWidth() {

        return getWindow().getDecorView().getWidth();
    }

    private View getContentView() {
        return getWindow().findViewById(Window.ID_ANDROID_CONTENT);
    }


    public SharedPreferencesUtil getSharedPreferencesUtil() {
        if (sharedPreferencesUtil == null) {
            sharedPreferencesUtil = SharedPreferencesUtil.getInstance(mContext);
        }
        return sharedPreferencesUtil;
    }

    public SpUtil getSpUtil() {
        if (spUtil == null) {
            spUtil = SpUtil.getInstance(mContext);
        }
        return spUtil;
    }
}
