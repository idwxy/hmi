package com.idwxy.hmi.dao;

import com.idwxy.hmi.entity.User;

public interface UserDao {

    /**
     * 查询用户
     * @param id
     * @return
     */
    User select(Integer id);

    /**
     * 新建用户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int delete(Integer id);
}
