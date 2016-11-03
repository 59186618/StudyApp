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

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * 课程类
 */

@Entity
public class CurriculumBean {
    @Id(autoincrement = true)
    private Long id;//数据库ID
    private int curriculumId;//课程ID
    private int resId;//课程图标
    private String curriculumName;//课程名字
    private String teacher;//课程任教老师
    @Generated(hash = 183103904)
    public CurriculumBean(Long id, int curriculumId, int resId,
            String curriculumName, String teacher) {
        this.id = id;
        this.curriculumId = curriculumId;
        this.resId = resId;
        this.curriculumName = curriculumName;
        this.teacher = teacher;
    }
    @Generated(hash = 1647895791)
    public CurriculumBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getCurriculumId() {
        return this.curriculumId;
    }
    public void setCurriculumId(int curriculumId) {
        this.curriculumId = curriculumId;
    }
    public int getResId() {
        return this.resId;
    }
    public void setResId(int resId) {
        this.resId = resId;
    }
    public String getCurriculumName() {
        return this.curriculumName;
    }
    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }
    public String getTeacher() {
        return this.teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

}
