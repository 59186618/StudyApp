package com.example.herve.Study.ui.curriculum.score;

import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.herve.Study.R;
import com.example.herve.Study.base.ui.MvpBaseActivity;
import com.example.herve.Study.bean.AnswerBean;
import com.example.herve.Study.bean.QuestionBean;
import com.example.herve.Study.common.AppConstant;
import com.example.herve.Study.ui.curriculum.score.presenter.ScoreConstant;
import com.example.herve.Study.ui.curriculum.score.presenter.ScorePresenter;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created           :Herve on 2016/11/20.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/11/20
 * @ projectName     :StudyApp
 * @ version
 */
public class ScoreActivity extends MvpBaseActivity<ScorePresenter> implements ScoreConstant.PresenterView {

    @BindView(R.id.tv_score_title)
    AppCompatTextView tvScoreTitle;
    @BindView(R.id.cv_score_title)
    CardView cvScoreTitle;
    @BindView(R.id.rv_score_detail)
    RecyclerView rvScoreDetail;
    @BindView(R.id.btn_sure)
    AppCompatButton btnSure;

    /**
     * 数据
     */
    private ScoreAdapter scoreAdapter;

    @Override
    public void isShowDialog(boolean needShow) {

        showSuperDialog(false);
    }

    @Override
    public void success() {

        scoreAdapter = new ScoreAdapter(mContext);
        scoreAdapter.setData((ArrayList<QuestionBean>) AppConstant.examinationPaperBean.getQuestionBeans());
        scoreAdapter.setQuestionBeans(AppConstant.answerSheetBean.getAnswerBeans());

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(mContext, 5, RecyclerView.VERTICAL, false);

        rvScoreDetail.setLayoutManager(layoutManager);

        rvScoreDetail.setAdapter(scoreAdapter);


    }

    @Override
    public void error(int errorCode) {

    }

    @Override
    protected ScorePresenter initPresenter() {
        return new ScorePresenter(this);
    }

    @Override
    protected int initLayoutId() {
        return R.layout.activity_score;
    }

    @Override
    protected void findViewById() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

        showSuperDialog(false);

        mPresenter.loading();


    }

    @Override
    protected void initListener() {

    }


}