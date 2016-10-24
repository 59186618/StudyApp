package com.example.herve.Study.ui.home.Fragments.life.adapter;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

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
public class GradeItemAdapter extends RecyclerView.Adapter<GradeItemAdapter.GradeItemViewHolder> {


    private ArrayList<CurriculumBean> data;

    private Context mContext;


    public GradeItemAdapter(ArrayList<CurriculumBean> data, Context mContext) {
        this.data = data;
        this.mContext = mContext;
    }

    public void setData(ArrayList<CurriculumBean> data) {
        this.data = data;
    }

    @Override
    public GradeItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_curriculum_layout, parent, false);


        return new GradeItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(GradeItemViewHolder holder, int position) {

        CurriculumBean curriculumBean = data.get(position);
//        holder.ivCurriculumIcon.setImageResource(curriculumBean.getResId());
        holder.ivCurriculumIcon.setImageResource(R.drawable.ic_account_balance_wallet_black_24dp);
        holder.tvCurriculumName.setText(curriculumBean.getName());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class GradeItemViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.iv_curriculum_icon)
        ImageView ivCurriculumIcon;
        @BindView(R.id.tv_curriculum_name)
        AppCompatTextView tvCurriculumName;

        public GradeItemViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
