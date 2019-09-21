package com.idwxy.hmi.service.impl;

import com.idwxy.hmi.dao.DoctorDao;
import com.idwxy.hmi.entity.Doctor;
import com.idwxy.hmi.service.DoctorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Resource
    private DoctorDao doctorDao;

    // 新建健康管理员
    @Override
    public int insertDoctor(Doctor doctor) {
        int modifyId = doctorDao.insert(doctor);
        return modifyId;
    }

    // 更新健康管理员
    @Override
    public int updateDoctor(Doctor doctor) {
        int modifyId = doctorDao.update(doctor);
        return modifyId;
    }

    // 删除健康管理员
    @Override
    public int deleteDoctor(Integer id) {
        int modifyId = doctorDao.delete(id);
        return 0;
    }

    // 查询健康管理员
    @Override
    public Doctor selectDoctor(Integer id) {
        Doctor doctor = doctorDao.select(id);
        return doctor;
    }
}
