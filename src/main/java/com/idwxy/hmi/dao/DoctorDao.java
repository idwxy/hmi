package com.idwxy.hmi.dao;

import com.idwxy.hmi.entity.Doctor;

public interface DoctorDao {

    /**
     * 查询健康管理员
     * @param id
     * @return
     */
    Doctor select(Integer id);

    /**
     * 新建健康管理员
     * @param doctor
     * @return
     */
    int insert(Doctor doctor);

    /**
     * 更新健康管理员
     * @param doctor
     * @return
     */
    int update(Doctor doctor);

    /**
     * 删除健康管理员
     * @param id
     * @return
     */
    int delete(Integer id);
}
