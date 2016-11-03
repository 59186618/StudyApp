package com.example.herve.Study.bean;

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
public class GradeBean {

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
}
