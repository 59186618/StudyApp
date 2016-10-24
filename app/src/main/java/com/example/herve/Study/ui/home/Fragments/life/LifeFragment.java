package com.example.herve.Study.ui.home.Fragments.life;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import com.example.herve.Study.R;
import com.example.herve.Study.base.ui.MvpBaseFragment;
import com.example.herve.Study.bean.GradeBean;
import com.example.herve.Study.ui.home.Fragments.life.adapter.LifeAdapter;
import com.example.herve.Study.ui.home.Fragments.life.presenter.LifeContract;
import com.example.herve.Study.ui.home.Fragments.life.presenter.LifePresenter;
import com.example.herve.Study.utils.fastjson.FastJsonParser;
import com.example.herve.Study.utils.string.StringUtils;

import java.util.ArrayList;

import butterknife.BindView;


/**
 * Created           :Herve on 2016/10/10.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/10
 * @ projectName     :SquareDemo
 * @ version
 */
public class LifeFragment extends MvpBaseFragment<LifeContract.Presenter> implements LifeContract.PresenterView {

    @BindView(R.id.recycle_view_life)
    RecyclerView recycleViewLife;
    @BindView(R.id.progress)
    ProgressBar progress;


    public static LifeFragment newInstance() {
        LifeFragment fragment = new LifeFragment();
        return fragment;
    }

    public static LifeFragment newInstance(Bundle args) {
        LifeFragment fragment = new LifeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setProgressVisibility(int visibility) {
        progress.setVisibility(visibility);

    }

    @Override
    public void success() {
        LifeAdapter lifeAdapter = new LifeAdapter(mContext);


        String jsonDta = StringUtils.getJson(mContext, "课程分类.json");


        ArrayList<GradeBean> data = (ArrayList<GradeBean>) FastJsonParser.getInstance().listFromJson(jsonDta, GradeBean.class);

        lifeAdapter.setData(data);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(mContext, 1);
        recycleViewLife.setLayoutManager(layoutManager);
        recycleViewLife.setAdapter(lifeAdapter);

    }

    @Override
    public void error() {
        showToast("加载失败！");
    }

    @Override
    protected LifeContract.Presenter initPresenter() {
        return new LifePresenter(this);
    }

    @Override
    protected int initLayoutId() {
        return R.layout.fragment_life_layout;
    }

    @Override
    protected void findViewById() {
        //if you using butterKnife you can doNothing
    }

    @Override
    protected void initView() {
        //you can set VIEW.setLayoutParams() at here;

    }

    @Override
    protected void initData() {
        mPresenter.loading();

    }

    @Override
    protected void initListener() {

    }

}
