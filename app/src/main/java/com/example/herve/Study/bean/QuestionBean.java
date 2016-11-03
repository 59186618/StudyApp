package com.example.herve.Study.bean;

import com.example.herve.Study.greendao.dao.DaoSession;
import com.example.herve.Study.greendao.dao.QuestionBeanDao;
import com.example.herve.Study.greendao.dao.SelectBeanDao;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;

/**
 * Created           :Herve on 2016/10/25.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/25
 * @ projectName     :StudyApp
 * @ version
 */


/**
 * 教师出的的试题
 * */
@Entity
public class QuestionBean {
    @Id(autoincrement = true)
    private Long id;//数据库ID
    private String question;//问题
    @ToMany(referencedJoinProperty = "selectId")
    private List<SelectBean> selectBeens;//选项A
    private String solution;//解析
    private String answerKey;//正确答案
    private int score;//分数
    private int difficulty;//难度等级
    private int type;//类型
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 170334476)
    private transient QuestionBeanDao myDao;
    @Generated(hash = 1156336696)
    public QuestionBean(Long id, String question, String solution,
            String answerKey, int score, int difficulty, int type) {
        this.id = id;
        this.question = question;
        this.solution = solution;
        this.answerKey = answerKey;
        this.score = score;
        this.difficulty = difficulty;
        this.type = type;
    }
    @Generated(hash = 842286453)
    public QuestionBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getQuestion() {
        return this.question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getSolution() {
        return this.solution;
    }
    public void setSolution(String solution) {
        this.solution = solution;
    }
    public String getAnswerKey() {
        return this.answerKey;
    }
    public void setAnswerKey(String answerKey) {
        this.answerKey = answerKey;
    }
    public int getScore() {
        return this.score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getDifficulty() {
        return this.difficulty;
    }
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
    public int getType() {
        return this.type;
    }
    public void setType(int type) {
        this.type = type;
    }
    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 557168594)
    public List<SelectBean> getSelectBeens() {
        if (selectBeens == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SelectBeanDao targetDao = daoSession.getSelectBeanDao();
            List<SelectBean> selectBeensNew = targetDao._queryQuestionBean_SelectBeens(id);
            synchronized (this) {
                if(selectBeens == null) {
                    selectBeens = selectBeensNew;
                }
            }
        }
        return selectBeens;
    }
    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 725077886)
    public synchronized void resetSelectBeens() {
        selectBeens = null;
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 45468637)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getQuestionBeanDao() : null;
    }


}
