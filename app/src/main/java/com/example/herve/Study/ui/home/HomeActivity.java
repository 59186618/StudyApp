package com.example.herve.Study.ui.home;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.herve.Study.R;
import com.example.herve.Study.base.ui.BaseFragment;
import com.example.herve.Study.base.ui.MvpBaseActivity;
import com.example.herve.Study.greendao.dao.ExaminationPaperBeanDao;
import com.example.herve.Study.ui.home.Fragments.life.LifeFragment;
import com.example.herve.Study.ui.home.adapter.FragmentsAdapter;
import com.example.herve.Study.ui.home.presenter.MainConstant;
import com.example.herve.Study.ui.home.presenter.MainPresenter;
import com.example.herve.Study.wediget.HerveTabLayout.HerveTabLayout;

import java.io.File;
import java.util.ArrayList;

import butterknife.BindView;

public class HomeActivity extends MvpBaseActivity<MainPresenter> implements MainConstant.PresenterView, NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.tab_layout)
    HerveTabLayout tabLayout;
    @BindView(R.id.vp_home)
    ViewPager vpHome;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.activity_home)
    RelativeLayout activityHome;
    @BindView(R.id.appbar)
    AppBarLayout appbar;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    String cacheName = "http://bj.bcebos.com/v1/tomato-dev/e8f42651-701e-11e6-9172-94de8065b233/e8f42651-701e-11e6-9172-94de8065b233.jpg";

    ImageView iv_navigation;
    private FragmentsAdapter fragmentsAdapter;
    private String TAG = getClass().getSimpleName();

    ExaminationPaperBeanDao examinationPaperBeanDao;


    @Override
    protected int initLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    protected void findViewById() {
        //if you using butterKnife you can doNothing
        View headerView = navView.getHeaderView(0);
        iv_navigation = (ImageView) headerView.findViewById(R.id.iv_navigation);

        iv_navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i(TAG, "onClick: 缓存目录=" + Glide.getPhotoCacheDir(mContext, cacheName).getAbsolutePath());

                File file = Glide.getPhotoCacheDir(mContext, cacheName);
                if (file.exists()) {
                    boolean success = file.delete();
                    if (success) {
                        Toast.makeText(mContext, "清除成功", Toast.LENGTH_SHORT).show();

                    }
                }

                Custom custom=new Custom();
                custom.execute();



            }
        });


    }


    private class  Custom  extends AsyncTask{

        @Override
        protected Object doInBackground(Object[] params) {
            Glide.get(mContext).clearDiskCache();
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            Glide.get(mContext).clearMemory();

            Glide.with(mContext).load(cacheName).into(iv_navigation);

        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.drawer01) {
            // Handle the camera action
        } else if (id == R.id.drawer02) {

        } else if (id == R.id.drawer03) {

        } else if (id == R.id.drawer04) {

        } else if (id == R.id.drawer05) {

        } else if (id == R.id.drawer06) {

        } else if (id == R.id.drawer07) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    protected void initView() {
        toolbar.setTitle("小学生之友");
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.tab_home1, R.string.tab_home2);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    protected void initData() {
//        examinationPaperBeanDao= App.getApp().getDaoSession().e
        Glide.with(mContext).load(cacheName).into(iv_navigation);

        mPresenter.loadData();
    }

    @Override
    protected void initListener() {
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                Log.i(TAG, "onClick: Snackbar的点击事件：" + "点击了");

                            }
                        }).show();
            }
        });


    }

    @Override
    protected MainPresenter initPresenter() {
        return new MainPresenter(this);
    }


    @Override
    public void isShowDialog(boolean needShow) {

        showSuperDialog(needShow);
    }

    @Override
    public void success() {
        fragmentsAdapter = new FragmentsAdapter(getSupportFragmentManager(), mContext);

        ArrayList<BaseFragment> data = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            BaseFragment baseFragment;
            if (i == 0) {
                baseFragment = new LifeFragment();
                baseFragment.setTittle("生活");

            } else {
                baseFragment = new LifeFragment();
                baseFragment.setTittle("工作");
            }
            data.add(baseFragment);
        }

        fragmentsAdapter.setData(data);

        vpHome.setOffscreenPageLimit(data.size());

        vpHome.setAdapter(fragmentsAdapter);

        tabLayout.setupWithViewPager(vpHome);


    }

    @Override
    public void error(int errorCode) {

    }


}
