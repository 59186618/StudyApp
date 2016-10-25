package com.example.herve.Study.ui.curriculum.adapter;

import android.content.Context;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.herve.Study.R;
import com.example.herve.Study.bean.QuestionBean;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created           :Herve on 2016/10/25.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/25
 * @ projectName     :StudyApp
 * @ version
 */
public class CurriculumAdapter extends RecyclerView.Adapter<CurriculumAdapter.CurriculumViewHolder> {


    private Context mContext;

    ArrayList<QuestionBean> data = new ArrayList<>();

    public CurriculumAdapter(Context mContext, ArrayList<QuestionBean> data) {
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public CurriculumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        ViewGroup itemView = (ViewGroup) LayoutInflater.from(mContext).inflate(R.layout.item_question_layout, parent, false);


        return new CurriculumViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CurriculumViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class CurriculumViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_question)
        AppCompatCheckedTextView tvQuestion;
        @BindView(R.id.tv_select_tab_a)
        AppCompatCheckedTextView tvSelectTabA;
        @BindView(R.id.tv_select_a)
        AppCompatCheckedTextView tvSelectA;
        @BindView(R.id.tv_select_tab_b)
        AppCompatCheckedTextView tvSelectTabB;
        @BindView(R.id.tv_select_b)
        AppCompatCheckedTextView tvSelectB;
        @BindView(R.id.tv_select_tab_c)
        AppCompatCheckedTextView tvSelectTabC;
        @BindView(R.id.tv_select_c)
        AppCompatCheckedTextView tvSelectC;
        @BindView(R.id.tv_select_tab_d)
        AppCompatCheckedTextView tvSelectTabD;
        @BindView(R.id.tv_select_d)
        AppCompatCheckedTextView tvSelectD;
        @BindView(R.id.iv_solution)
        AppCompatImageView ivSolution;
        @BindView(R.id.tv_solution_exp)
        AppCompatCheckedTextView tvSolutionExp;
        @BindView(R.id.tv_solution)
        AppCompatCheckedTextView tvSolution;

        public CurriculumViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}