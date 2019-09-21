package com.idwxy.hmi.service.impl;

import com.idwxy.hmi.dao.UserDao;
import com.idwxy.hmi.entity.User;
import com.idwxy.hmi.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    // 创建用户
    @Override
    public int insert(User user) {
        int modifyId = userDao.insert(user);
        return modifyId;
    }

    // 删除用户
    @Override
    public int deleteUser(Integer id) {
        int modifyId = userDao.delete(id);
        return modifyId;
    }

    // 更新用户
    @Override
    public int updateUser(User user) {
        int modifyId = userDao.update(user);
        return modifyId;
    }

    // 查询用户
    @Override
    public User select(Integer id) {
        User user = userDao.select(id);
        return user;
    }
}
