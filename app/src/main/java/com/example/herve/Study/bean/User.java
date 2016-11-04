package com.example.herve.Study.bean;

/**
 * Created           :Herve on 2016/10/23.
 *
 * @ Author          :Herve
 * @ e-mail          :lijianyou.herve@gmail.com
 * @ LastEdit        :2016/10/23
 * @ projectName     :BaseApp
 * @ version
 */

import android.os.Parcel;
import android.os.Parcelable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class User  implements Parcelable {
    @Id(autoincrement = true)
    private Long id;//数据库ID
    private String userId;//账号ID
    private String passWord;//密码
    private String name;//名字
    private String age;//年龄
    private boolean sex;//
    private int Identity;//身份（学生，家长，老师）
    private String duties;//职务（班主任，班长）
    private int grade;//年级
    private String headTeacher;//班主任
    private String fiduciary;//监护人
    private String father;//父亲
    private String mother;//母亲
    private String characterization;//描述

    public User(String userId, String passWord, String name, String age, boolean sex, int grade) {
        this.userId = userId;
        this.passWord = passWord;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.grade = grade;
    }

    @Generated(hash = 1930924153)
    public User(Long id, String userId, String passWord, String name, String age, boolean sex,
            int Identity, String duties, int grade, String headTeacher, String fiduciary,
            String father, String mother, String characterization) {
        this.id = id;
        this.userId = userId;
        this.passWord = passWord;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.Identity = Identity;
        this.duties = duties;
        this.grade = grade;
        this.headTeacher = headTeacher;
        this.fiduciary = fiduciary;
        this.father = father;
        this.mother = mother;
        this.characterization = characterization;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean getSex() {
        return this.sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getDuties() {
        return this.duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getHeadTeacher() {
        return this.headTeacher;
    }

    public void setHeadTeacher(String headTeacher) {
        this.headTeacher = headTeacher;
    }

    public String getFiduciary() {
        return this.fiduciary;
    }

    public void setFiduciary(String fiduciary) {
        this.fiduciary = fiduciary;
    }

    public String getFather() {
        return this.father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return this.mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getCharacterization() {
        return this.characterization;
    }

    public void setCharacterization(String characterization) {
        this.characterization = characterization;
    }

    public int getIdentity() {
        return this.Identity;
    }

    public void setIdentity(int Identity) {
        this.Identity = Identity;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.userId);
        dest.writeString(this.passWord);
        dest.writeString(this.name);
        dest.writeString(this.age);
        dest.writeByte(this.sex ? (byte) 1 : (byte) 0);
        dest.writeInt(this.Identity);
        dest.writeString(this.duties);
        dest.writeInt(this.grade);
        dest.writeString(this.headTeacher);
        dest.writeString(this.fiduciary);
        dest.writeString(this.father);
        dest.writeString(this.mother);
        dest.writeString(this.characterization);
    }

    protected User(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.userId = in.readString();
        this.passWord = in.readString();
        this.name = in.readString();
        this.age = in.readString();
        this.sex = in.readByte() != 0;
        this.Identity = in.readInt();
        this.duties = in.readString();
        this.grade = in.readInt();
        this.headTeacher = in.readString();
        this.fiduciary = in.readString();
        this.father = in.readString();
        this.mother = in.readString();
        this.characterization = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}


