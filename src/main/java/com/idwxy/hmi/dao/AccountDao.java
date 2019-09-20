package com.idwxy.hmi.dao;

import com.idwxy.hmi.entity.Account;

public interface AccountDao {

    /**
     * 查询账户
     * @param userId
     * @return
     */
    Integer select(Integer userId);

    /**
     * 更新账户
     * @param account
     * @return
     */
    int update(Account account);
}
