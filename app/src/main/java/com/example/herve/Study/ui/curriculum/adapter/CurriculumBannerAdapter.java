package com.example.herve.Study.ui.curriculum.adapter;

import android.content.Context;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.bannerlibrary.BannerPagerAdapter;
import com.example.herve.Study.R;
import com.example.herve.Study.bean.QuestionBean;

import java.util.List;

/**
 * Created           :Herve on 2016/10/30.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/30
 * @ projectName     :StudyApp
 * @ version
 */
public class CurriculumBannerAdapter extends BannerPagerAdapter<QuestionBean> {

    private Context mContext;


    public CurriculumBannerAdapter(Context mContext, List<QuestionBean> data, boolean isLimited) {
        super(data, isLimited);
        this.mContext = mContext;
    }

    @Override
    public View setView(ViewGroup container, int position) {

        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_banner_question_layout, null);


        AppCompatCheckedTextView tvQuestion = (AppCompatCheckedTextView) itemView.findViewById(R.id.tv_question);
        LinearLayout llSelectA = (LinearLayout) itemView.findViewById(R.id.ll_select_a);
        AppCompatCheckedTextView tvSelectTabA = (AppCompatCheckedTextView) itemView.findViewById(R.id.tv_select_tab_a);
        AppCompatCheckedTextView tvSelectA = (AppCompatCheckedTextView) itemView.findViewById(R.id.tv_select_a);
        LinearLayout llSelectB = (LinearLayout) itemView.findViewById(R.id.ll_select_b);
        AppCompatCheckedTextView tvSelectTabB = (AppCompatCheckedTextView) itemView.findViewById(R.id.tv_select_tab_b);
        AppCompatCheckedTextView tvSelectB = (AppCompatCheckedTextView) itemView.findViewById(R.id.tv_select_b);
        LinearLayout llSelectC = (LinearLayout) itemView.findViewById(R.id.ll_select_c);
        AppCompatCheckedTextView tvSelectTabC = (AppCompatCheckedTextView) itemView.findViewById(R.id.tv_select_tab_c);
        AppCompatCheckedTextView tvSelectC = (AppCompatCheckedTextView) itemView.findViewById(R.id.tv_select_c);
        LinearLayout llSelectD = (LinearLayout) itemView.findViewById(R.id.ll_select_d);
        AppCompatCheckedTextView tvSelectTabD = (AppCompatCheckedTextView) itemView.findViewById(R.id.tv_select_tab_d);
        AppCompatCheckedTextView tvSelectD = (AppCompatCheckedTextView) itemView.findViewById(R.id.tv_select_d);
        AppCompatImageView ivSolution = (AppCompatImageView) itemView.findViewById(R.id.iv_solution);
        AppCompatCheckedTextView tvSolutionExp = (AppCompatCheckedTextView) itemView.findViewById(R.id.tv_solution_exp);
        AppCompatCheckedTextView tvSolution = (AppCompatCheckedTextView) itemView.findViewById(R.id.tv_solution);


        setTag(llSelectA, "A");
        setTag(llSelectB, "B");
        setTag(llSelectC, "C");
        setTag(llSelectD, "D");

        setListener(tvQuestion, llSelectA);
        setListener(tvQuestion, llSelectB);
        setListener(tvQuestion, llSelectC);
        setListener(tvQuestion, llSelectD);

        return itemView;
    }

    private void setListener(final TextView tvQuestion, View tvSelect) {
        tvSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvQuestion.append("( " + (String) view.getTag() + " )");
            }
        });


    }

    private void setTag(View selectView, String tag) {
        selectView.setTag(tag);


    }

}
