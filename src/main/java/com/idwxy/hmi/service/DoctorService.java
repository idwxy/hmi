package com.idwxy.hmi.service;

import com.idwxy.hmi.entity.Doctor;

public interface DoctorService {

    /**
     * 新建健康管理员
     * @param doctor
     * @return
     */
    int insertDoctor(Doctor doctor);

    /**
     * 更新健康管理员
     * @param doctor
     * @return
     */
    int updateDoctor(Doctor doctor);

    /**
     * 删除健康管理员
     * @param id
     * @return
     */
    int deleteDoctor(Integer id);

    /**
     * 查询健康管理员
     * @param id
     * @return
     */
    Doctor selectDoctor(Integer id);
}
