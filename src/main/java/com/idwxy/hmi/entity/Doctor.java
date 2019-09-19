package com.idwxy.hmi.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class Doctor {

    // 主键 id
    private Integer id;
    // 名称
    private String name;
    // 性别
    private Integer gender;
    // 学历
    private String education;
    // 编号
    private String certificateId;
    // 一对多
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private List<User> users;

    // 构造函数
    public Doctor() {
        super();
    }

    public Doctor(String name, Integer gender, String education, String certificateId, List<User> users) {
        super();
        this.name = name;
        this.gender = gender;
        this.education = education;
        this.certificateId = certificateId;
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "Doctor [id=" + id +
                ", name=" + name +
                ", gender" + gender +
                ", education=" + education +
                ", certificateId=" + certificateId +
                ", users=" + users + "]";
    }
}
