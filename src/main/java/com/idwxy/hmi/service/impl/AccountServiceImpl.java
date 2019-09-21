package com.idwxy.hmi.service.impl;

import com.idwxy.hmi.dao.AccountDao;
import com.idwxy.hmi.entity.Account;
import com.idwxy.hmi.entity.TransferDetail;
import com.idwxy.hmi.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public String transfer(TransferDetail transferDetail) {
        try {
            // 获取转账金额
            Integer money = transferDetail.getMoney();
            // 获取用户id
            Integer userId = transferDetail.getUserId();
            // 获取健康管理员id
            Integer doctorId = transferDetail.getDoctorId();

            // 获取用户余额
            Integer userBalance = accountDao.select(userId);
            // 获取健康管理员余额
            Integer doctorBalance = accountDao.select(doctorId);

            // 更新用户、健康管理员账户余额
            if (userBalance >= money) {
                Account userAccount = new Account(userId, userBalance - money);
                accountDao.update(userAccount);
                Account doctorAccount = new Account(doctorId, doctorBalance + money);
                accountDao.update(doctorAccount);
            } else {
                return "balance error";
            }
            return "success";
        } catch (Exception e) {
            throw e;
        }
    }
}
