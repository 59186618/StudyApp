package com.example.herve.Study.ui.curriculum.score;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.herve.Study.R;
import com.example.herve.Study.bean.AnswerBean;
import com.example.herve.Study.bean.QuestionBean;
import com.example.herve.Study.wediget.recycleview.HeadFootBaseAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created           :Herve on 2016/11/20.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/11/20
 * @ projectName     :StudyApp
 * @ version
 */
public class ScoreAdapter extends HeadFootBaseAdapter<ScoreAdapter.ScoreViewHolder, QuestionBean> {


    private List<AnswerBean> answerBeen;


    public ScoreAdapter(Context mContext) {
        super(mContext);
    }


    public void setQuestionBeans(List<AnswerBean> answerBeen) {
        this.answerBeen = answerBeen;
    }

    @Override
    protected ScoreViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_score_layout, parent, false);

        return new ScoreViewHolder(itemView);
    }

    @Override
    protected void onBindItemViewHolder(ScoreViewHolder holder, int position) {


        if (position > answerBeen.size() - 1 || answerBeen.get(position).getSelectBeans().size() == 0) {
            holder.cvItemAnswer.setCardBackgroundColor(mContext.getResources().getColor(R.color.white));

        } else if (answerBeen.get(position).getSelectBeans().get(0).getSelect().equals(data.get(position).getAnswerKey())) {

            holder.cvItemAnswer.setCardBackgroundColor(mContext.getResources().getColor(R.color.green_14e715));
        } else {

            holder.cvItemAnswer.setCardBackgroundColor(mContext.getResources().getColor(R.color.red_error));
        }


        holder.tvQuestionId.setText(position + "");

    }

    public class ScoreViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_question_id)
        TextView tvQuestionId;
        @BindView(R.id.cv_item_answer)
        CardView cvItemAnswer;

        public ScoreViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}