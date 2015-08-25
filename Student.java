package com.wenyue.xml.demo;

/**
 * Created by wswenyue on 2015/8/25.
 */
public class Student {
    private String name;
    private String sex;
    private Integer age;
    private String email;
    private String birthday;
    private String memo;
    private Integer id;
    private Integer group;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Student(String name, String sex, Integer age, String email, String birthday, String memo) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
        this.birthday = birthday;
        this.memo = memo;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", memo='" + memo + '\'' +
                ", id=" + id +
                ", group=" + group +
                '}';
    }
}
