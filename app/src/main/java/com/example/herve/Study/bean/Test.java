package com.example.herve.Study.bean;

import java.util.List;

/**
 * Created           :Herve on 2016/10/24.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/24
 * @ projectName     :BJXAPP
 * @ version
 */
public class Test {

    /**
     * tittle : 一年级
     * CurriculumBean : [{"resId":1,"name":"爱情"},{"resId":1,"name":"爱情"}]
     */

    private String tittle;
    /**
     * resId : 1
     * name : 爱情
     */

    private List<CurriculumBeanBean> CurriculumBean;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public List<CurriculumBeanBean> getCurriculumBean() {
        return CurriculumBean;
    }

    public void setCurriculumBean(List<CurriculumBeanBean> CurriculumBean) {
        this.CurriculumBean = CurriculumBean;
    }

    public static class CurriculumBeanBean {
        private int resId;
        private String name;

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
}
