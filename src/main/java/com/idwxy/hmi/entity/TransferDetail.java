package com.idwxy.hmi.entity;

public class TransferDetail {
    // 主键 id
    private Integer id;
    // 用户 id
    private Integer userId;
    // 医生 id
    private Integer doctorId;
    // 转账金额
    private Integer money;

    // 构造函数
    public TransferDetail() {
        super();
    }

    public TransferDetail(Integer userId, Integer doctorId, Integer money) {
        super();
        this.userId = userId;
        this.doctorId = doctorId;
        this.money = money;
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

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "TransferDetail [id=" + id +
                ", userId=" + userId +
                ", doctor=" + doctorId +
                ", money=" + money + "]";
    }
}
