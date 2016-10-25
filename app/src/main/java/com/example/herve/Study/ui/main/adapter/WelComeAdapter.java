package com.example.herve.Study.ui.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.bannerlibrary.BannerPagerAdapter;
import com.example.herve.Study.R;

import java.util.List;

/**
 * Created           :Herve on 2016/10/23.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/23
 * @ projectName     :BJXAPP
 * @ version
 */
public class WelComeAdapter extends BannerPagerAdapter {


    private Context mContext;


    public WelComeAdapter(Context context, List data) {
        super(context, data);
        mContext = context;
    }

    @Override
    public View setView(ViewGroup container, int position) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.welcome_item, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.vp_welcome);
        imageView.setImageResource(R.drawable.welcome);

        return itemView;
    }
}
