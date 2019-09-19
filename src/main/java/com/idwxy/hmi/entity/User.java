package com.idwxy.hmi.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User {

    // 自增主键 id
    private Integer id;
    // 用户名称
    private String name;
    // 用户性别
    @JsonInclude(Include.NON_DEFAULT)
    private Integer gender;
    // 用户年龄
    @JsonInclude(Include.NON_DEFAULT)
    private Integer age;
    // 多对一
    @JsonInclude(Include.NON_DEFAULT)
    private Doctor doctor;

    // 构造方法
    public User() {
        super();
    }

    public User(String name, Integer gender, Integer age, Doctor doctor) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.doctor = doctor;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "User [id=" + id +
                ", name=" + name +
                ", gender=" + gender +
                ", age=" + age +
                ", doctor=" + doctor + "]";
    }
}
