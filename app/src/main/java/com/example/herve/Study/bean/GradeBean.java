package com.example.herve.Study.bean;

import java.util.ArrayList;

/**
 * Created           :Herve on 2016/10/23.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/23
 * @ projectName     :BJXAPP
 * @ version
 */
public class GradeBean {

    private String gradeName;

    private ArrayList<CurriculumBean> curriculumBeans;

    public GradeBean() {
    }

    public GradeBean(String gradeName, ArrayList<CurriculumBean> curriculumBeans) {
        this.gradeName = gradeName;
        this.curriculumBeans = curriculumBeans;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public ArrayList<CurriculumBean> getCurriculumBean() {
        return curriculumBeans;
    }

    public void setCurriculumBean(ArrayList<CurriculumBean> curriculumBean) {
        this.curriculumBeans = curriculumBean;
    }
}
