package com.example.herve.Study.ui.home;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.widget.Toolbar;
import android.widget.RelativeLayout;

import com.example.herve.Study.R;
import com.example.herve.Study.base.ui.BaseFragment;
import com.example.herve.Study.base.ui.MvpBaseActivity;
import com.example.herve.Study.ui.home.Fragments.life.LifeFragment;
import com.example.herve.Study.ui.home.adapter.FragmentsAdapter;
import com.example.herve.Study.ui.home.presenter.MainConstant;
import com.example.herve.Study.ui.home.presenter.MainPresenterView;

import java.util.ArrayList;

import butterknife.BindView;

public class HomeActivity extends MvpBaseActivity<MainConstant.Presenter> implements MainConstant.PresenterView {

    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.vp_home)
    ViewPager vpHome;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.activity_home)
    RelativeLayout activityHome;
    @BindView(R.id.progress_bar)
    ContentLoadingProgressBar progressBar;

    private FragmentsAdapter fragmentsAdapter;
    private String TAG = getClass().getSimpleName();


    @Override
    protected int initLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    protected void findViewById() {
        //if you using butterKnife you can doNothing

    }

    @Override
    protected void initView() {
        toolbar.setTitle("");
        toolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);

    }

    @Override
    protected void initData() {
        mPresenter.loadData();
    }

    @Override
    protected void initListener() {

//        bottomView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                Log.i(TAG, "onNavigationItemSelected:getOrder= " + item.getOrder());
//                switch (item.getItemId()) {
//
//                    case R.id.tab_01:
//                        vpHome.setCurrentItem(0);
//                        break;
//                    case R.id.tab_02:
//                        vpHome.setCurrentItem(1);
//                        break;
//                    case R.id.tab_03:
//                        vpHome.setCurrentItem(2);
//                        break;
//                    default:
//
//                        Log.w(TAG, "onNavigationItemSelected: you have not get the MenuItem id");
//
//                        break;
//                }
//
//                return false;
//            }
//        });


    }

    @Override
    protected MainConstant.Presenter initPresenter() {
        return new MainPresenterView(this);
    }


    @Override
    public void setProgressVisibility(int visibility) {
        progressBar.setVisibility(visibility);
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
    public void error() {

    }

}
