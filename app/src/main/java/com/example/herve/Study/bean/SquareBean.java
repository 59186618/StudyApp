package com.example.herve.Study.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created           :Herve on 2016/10/10.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/10
 * @ projectName     :SquareDemo
 * @ version
 */


public class SquareBean  implements Parcelable {
    /**
     * resId : 1
     * title : 18720020222
     */

    private int resId;
    private String title;

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.resId);
        dest.writeString(this.title);
    }

    public SquareBean() {
    }

    protected SquareBean(Parcel in) {
        this.resId = in.readInt();
        this.title = in.readString();
    }

    public static final Creator<SquareBean> CREATOR = new Creator<SquareBean>() {
        @Override
        public SquareBean createFromParcel(Parcel source) {
            return new SquareBean(source);
        }

        @Override
        public SquareBean[] newArray(int size) {
            return new SquareBean[size];
        }
    };
}
