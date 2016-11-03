package com.example.herve.Study.bean;

import com.example.herve.Study.greendao.dao.AnswerBeanDao;
import com.example.herve.Study.greendao.dao.DaoSession;
import com.example.herve.Study.greendao.dao.ExaminationPaperBeanDao;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;

/**
 * Created           :Herve on 2016/11/3.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/11/3
 * @ projectName     :StudyApp
 * @ version
 */

/**
 * 学生试卷
 * */
@Entity
public class ExaminationPaperBean {
    @Id(autoincrement = true)
    private Long id;//数据库ID
    private String grade;//年级
    private String author;//命题人
    private int paperDifficulty;//试卷难度
    private int paperType;//试卷类型

    @ToMany(referencedJoinProperty = "answerId")
    private List<AnswerBean> answerBeens;//选的答案集
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 1747032759)
    private transient ExaminationPaperBeanDao myDao;

    @Generated(hash = 1731042262)
    public ExaminationPaperBean(Long id, String grade, String author,
            int paperDifficulty, int paperType) {
        this.id = id;
        this.grade = grade;
        this.author = author;
        this.paperDifficulty = paperDifficulty;
        this.paperType = paperType;
    }

    @Generated(hash = 1987161125)
    public ExaminationPaperBean() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPaperDifficulty() {
        return this.paperDifficulty;
    }

    public void setPaperDifficulty(int paperDifficulty) {
        this.paperDifficulty = paperDifficulty;
    }

    public int getPaperType() {
        return this.paperType;
    }

    public void setPaperType(int paperType) {
        this.paperType = paperType;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1470165351)
    public List<AnswerBean> getAnswerBeens() {
        if (answerBeens == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AnswerBeanDao targetDao = daoSession.getAnswerBeanDao();
            List<AnswerBean> answerBeensNew = targetDao._queryExaminationPaperBean_AnswerBeens(id);
            synchronized (this) {
                if(answerBeens == null) {
                    answerBeens = answerBeensNew;
                }
            }
        }
        return answerBeens;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 622063686)
    public synchronized void resetAnswerBeens() {
        answerBeens = null;
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
    @Generated(hash = 756318017)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getExaminationPaperBeanDao() : null;
    }

}
