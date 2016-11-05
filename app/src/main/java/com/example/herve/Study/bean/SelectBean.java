package com.example.herve.Study.bean;

/**
 * Created           :Herve on 2016/11/3.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/11/3
 * @ projectName     :StudyApp
 * @ version
 */

import android.os.Parcel;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * 学生选的试题的某一个选项
 */
@Entity
public class SelectBean implements BaseBean {
    @Id
    private Long selectId;//数据库ID
    private String select;

    @Generated(hash = 512626433)
    public SelectBean(Long selectId, String select) {
        this.selectId = selectId;
        this.select = select;
    }

    @Generated(hash = 1885432946)
    public SelectBean() {
    }

    public Long getSelectId() {
        return this.selectId;
    }

    public void setSelectId(Long selectId) {
        this.selectId = selectId;
    }

    public String getSelect() {
        return this.select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.selectId);
        dest.writeString(this.select);
    }

    protected SelectBean(Parcel in) {
        this.selectId = (Long) in.readValue(Long.class.getClassLoader());
        this.select = in.readString();
    }

    public static final Creator<SelectBean> CREATOR = new Creator<SelectBean>() {
        @Override
        public SelectBean createFromParcel(Parcel source) {
            return new SelectBean(source);
        }

        @Override
        public SelectBean[] newArray(int size) {
            return new SelectBean[size];
        }
    };
}
