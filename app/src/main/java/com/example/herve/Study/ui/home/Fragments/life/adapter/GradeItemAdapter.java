package com.example.herve.Study.ui.home.Fragments.life.adapter;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.herve.Study.R;
import com.example.herve.Study.bean.CurriculumBean;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created           :Herve on 2016/10/23.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/23
 * @ projectName     :BJXAPP
 * @ version
 */
abstract class GradeItemAdapter {


    private ArrayList<CurriculumBean> data;

    private Context mContext;
    private LinearLayout viewGroup;
    private String TAG = getClass().getSimpleName();


    public GradeItemAdapter(ArrayList<CurriculumBean> data, Context mContext) {
        this.data = data;
        this.mContext = mContext;

        viewGroup = (LinearLayout) LayoutInflater.from(mContext).inflate(R.layout.ver_linearlayout, null);

        setView();
    }

    private void setView() {

        GradeItemGroupViewHolder gradeItemViewHolder = null;

        int last = data.size() % 3;


        for (int position = 0; position < data.size() - last; position++) {
            CurriculumBean curriculumBean = data.get(position);
            if (position % 3 == 0) {
                gradeItemViewHolder = new GradeItemGroupViewHolder();
                gradeItemViewHolder.ivCurriculumIcon01.setImageResource(R.drawable.ic_account_balance_wallet_black_24dp);
                gradeItemViewHolder.tvCurriculumName01.setText(curriculumBean.getName());
            }
            if (position % 3 == 1) {
                gradeItemViewHolder.ivCurriculumIcon02.setImageResource(R.drawable.ic_account_balance_wallet_black_24dp);
                gradeItemViewHolder.tvCurriculumName02.setText(curriculumBean.getName());
            }
            if (position % 3 == 2) {
                gradeItemViewHolder.ivCurriculumIcon03.setImageResource(R.drawable.ic_account_balance_wallet_black_24dp);
                gradeItemViewHolder.tvCurriculumName03.setText(curriculumBean.getName());
                viewGroup.addView(gradeItemViewHolder.itemView);
            }

        }

        if (last > 0) {
            gradeItemViewHolder = new GradeItemGroupViewHolder();

            for (int i = 0; i < last; i++) {
                CurriculumBean curriculumBean = data.get(data.size() - last + i);
                if (i == 0) {
                    gradeItemViewHolder.ivCurriculumIcon01.setImageResource(R.drawable.ic_account_balance_wallet_black_24dp);
                    gradeItemViewHolder.tvCurriculumName01.setText(curriculumBean.getName());
                }
                if (i == 1) {
                    gradeItemViewHolder.ivCurriculumIcon02.setImageResource(R.drawable.ic_account_balance_wallet_black_24dp);
                    gradeItemViewHolder.tvCurriculumName02.setText(curriculumBean.getName());
                }

            }
            viewGroup.addView(gradeItemViewHolder.itemView);

        }

        getViews(viewGroup);
    }

    protected abstract void getViews(LinearLayout viewGroup);


    public void setData(ArrayList<CurriculumBean> data) {
        this.data = data;

    }

    public class GradeItemGroupViewHolder {
        View itemView;
        @BindView(R.id.iv_curriculum_icon_01)
        ImageView ivCurriculumIcon01;
        @BindView(R.id.tv_curriculum_name_01)
        AppCompatTextView tvCurriculumName01;
        @BindView(R.id.iv_curriculum_icon_02)
        ImageView ivCurriculumIcon02;
        @BindView(R.id.tv_curriculum_name_02)
        AppCompatTextView tvCurriculumName02;
        @BindView(R.id.iv_curriculum_icon_03)
        ImageView ivCurriculumIcon03;
        @BindView(R.id.tv_curriculum_name_03)
        AppCompatTextView tvCurriculumName03;

        public GradeItemGroupViewHolder() {
            itemView = LayoutInflater.from(mContext).inflate(R.layout.item_curriculum_layout, null, false);
            ButterKnife.bind(this, itemView);

        }
    }

}
