package com.example.herve.Study.base.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.herve.Study.R;
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

    private RelativeLayout mContentView;
    private View mRootView;
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

    protected ProgressBar mProgressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;

        setContentView(R.layout.activity_base);

        attchActivityLayout();

        mUnbinder = ButterKnife.bind(this);


        findViewById();

        initData();

        initView();

        initListener();

    }

    private void attchActivityLayout() {

        mContentView = (RelativeLayout) findViewById(R.id.rl_base_root);

        mRootView = LayoutInflater.from(mContext).inflate(initLayoutId(), mContentView, false);

        mContentView.addView(mRootView);

        initProgressBar();


    }

    private void initProgressBar() {
        mProgressBar = new ProgressBar(mContext);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.CENTER_IN_PARENT);
        mProgressBar.setLayoutParams(params);
        mProgressBar.setVisibility(View.GONE);

        mContentView.addView(mProgressBar);
    }


    public void showSnackToast(String Message) {

        Snackbar.make(getBaseActivityContentView(), Message, Snackbar.LENGTH_SHORT).show();
    }

    public void showToast(String Message) {

        Toast.makeText(mContext, Message, Toast.LENGTH_SHORT).show();
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

    private View getThisActivityContentView() {
        return mRootView;
    }

    private RelativeLayout getBaseActivityContentView() {
        return mContentView;
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
