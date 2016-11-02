package com.example.herve.Study.ui.home.Fragments.work;


import android.os.Bundle;

import com.example.herve.Study.R;
import com.example.herve.Study.base.ui.MvpBaseFragment;
import com.example.herve.Study.ui.home.Fragments.work.presenter.WorkContract;
import com.example.herve.Study.ui.home.Fragments.work.presenter.WorkPresenter;

/**
 * Created           :Herve on 2016/10/10.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/10
 * @ projectName     :SquareDemo
 * @ version
 */
public class WorkFragment extends MvpBaseFragment<WorkContract.Presenter> implements WorkContract.PresenterView {


    public static WorkFragment newInstance() {
        WorkFragment fragment = new WorkFragment();
        return fragment;
    }

    public static WorkFragment newInstance(Bundle args) {
        WorkFragment fragment = new WorkFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void isShowDialog(boolean needShow) {
        mContext.showSuperDialog(needShow);

    }

    @Override
    public void success() {

    }

    @Override
    public void error(int errorCode) {
        showToast("加载失败");

    }


    @Override
    protected WorkContract.Presenter initPresenter() {
        return new WorkPresenter(this);
    }

    @Override
    protected int initLayoutId() {
        return R.layout.fragment_work_layout;
    }

    @Override
    protected void findViewById() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        mPresenter.loading();

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void byUserReturnFragment() {

    }

}
