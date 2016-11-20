package com.example.herve.Study.ui.curriculum.score.presenter;

import com.example.herve.Study.base.presenter.MvpBasePresenter;

/**
 * Created           :Herve on 2016/11/20.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/11/20
 * @ projectName     :StudyApp
 * @ version
 */
public class ScorePresenter extends MvpBasePresenter<ScoreConstant.PresenterView> implements ScoreConstant.Presenter {

    public ScorePresenter(ScoreConstant.PresenterView mPresenter) {
        super(mPresenter);
    }
}