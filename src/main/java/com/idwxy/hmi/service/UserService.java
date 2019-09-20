package com.idwxy.hmi.service;

import com.idwxy.hmi.entity.User;

public interface UserService {

    /**
     * 创建用户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(Integer id);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 查询用户
     * @param id
     * @return
     */
    User select(Integer id);
}
