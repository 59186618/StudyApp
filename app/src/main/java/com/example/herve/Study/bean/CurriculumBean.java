package com.example.herve.Study.bean;

/**
 * Created           :Herve on 2016/10/23.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/23
 * @ projectName     :BJXAPP
 * @ version
 */
public class CurriculumBean {

    private int resId;
    private String name;

    public CurriculumBean() {
    }

    public CurriculumBean(int resId, String name) {
        this.resId = resId;
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
