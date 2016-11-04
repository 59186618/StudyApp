package com.example.herve.Study.bean;

import android.os.Parcel;
import android.os.Parcelable;

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

/*
* 年级类
* */
public class GradeBean implements Parcelable {

    private int gradeId;//年级ID
    private String gradeName;//年级名字
    private String headTeacher;//年级班主任


    private List<CurriculumBean> curriculumBeans;

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(String headTeacher) {
        this.headTeacher = headTeacher;
    }

    public List<CurriculumBean> getCurriculumBeans() {
        return curriculumBeans;
    }

    public void setCurriculumBeans(List<CurriculumBean> curriculumBeans) {
        this.curriculumBeans = curriculumBeans;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.gradeId);
        dest.writeString(this.gradeName);
        dest.writeString(this.headTeacher);
        dest.writeTypedList(this.curriculumBeans);
    }

    public GradeBean() {
    }

    protected GradeBean(Parcel in) {
        this.gradeId = in.readInt();
        this.gradeName = in.readString();
        this.headTeacher = in.readString();
        this.curriculumBeans = in.createTypedArrayList(CurriculumBean.CREATOR);
    }

    public static final Creator<GradeBean> CREATOR = new Creator<GradeBean>() {
        @Override
        public GradeBean createFromParcel(Parcel source) {
            return new GradeBean(source);
        }

        @Override
        public GradeBean[] newArray(int size) {
            return new GradeBean[size];
        }
    };
}
