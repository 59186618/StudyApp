package com.example.herve.Study.ui.curriculum.presenter;

import android.view.View;

import com.example.herve.Study.base.presenter.MvpBasePresenter;

/**
 * Created           :Herve on 2016/10/25.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/25
 * @ projectName     :StudyApp
 * @ version
 */

public class CurriculumPresenter extends MvpBasePresenter<CurriculumConstant.PresenterView> implements CurriculumConstant.Presenter {

    public CurriculumPresenter(CurriculumConstant.PresenterView mPresenter) {
        super(mPresenter);
    }


    @Override
    public void loading() {

        mPresenter.setProgressVisibility(View.VISIBLE);
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mPresenter.setProgressVisibility(View.GONE);
                mPresenter.success();

            }
        }, 2000);
    }
}