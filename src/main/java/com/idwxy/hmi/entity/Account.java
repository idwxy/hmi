package com.idwxy.hmi.entity;

public class Account {
    // 主键 id
    private Integer id;
    // 用户 id
    private Integer userId;
    // 账户余额
    private Integer balance;

    // 构造函数
    public Account() {
        super();
    }

    public Account(Integer userId, Integer balance) {
        super();
        this.userId = userId;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [id=" + id +
                ", userId=" + userId +
                ", balance=" + balance + "]";
    }
}
