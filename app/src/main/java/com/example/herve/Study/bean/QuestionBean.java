package com.example.herve.Study.bean;

/**
 * Created           :Herve on 2016/10/25.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/25
 * @ projectName     :StudyApp
 * @ version
 */
public class QuestionBean {

    private String question;
    private String selectA;
    private String selectB;
    private String selectC;
    private String selectD;
    private String solution;

    public QuestionBean() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getSelectA() {
        return selectA;
    }

    public void setSelectA(String selectA) {
        this.selectA = selectA;
    }

    public String getSelectB() {
        return selectB;
    }

    public void setSelectB(String selectB) {
        this.selectB = selectB;
    }

    public String getSelectC() {
        return selectC;
    }

    public void setSelectC(String selectC) {
        this.selectC = selectC;
    }

    public String getSelectD() {
        return selectD;
    }

    public void setSelectD(String selectD) {
        this.selectD = selectD;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
