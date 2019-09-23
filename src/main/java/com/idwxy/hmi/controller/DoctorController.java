package com.idwxy.hmi.controller;

import com.idwxy.hmi.common.ResultObject;
import com.idwxy.hmi.entity.Doctor;
import com.idwxy.hmi.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    // 创建健康管理员
    @PostMapping("/add")
    public ResultObject add(@RequestBody Doctor doctor) {
        int modifyId = doctorService.insertDoctor(doctor);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "sueecss", map);
        return resultObject;
    }

    // 删除健康管理员
    @DeleteMapping("/delete")
    public ResultObject delete(@RequestParam Integer id) {
        int modifyId = doctorService.deleteDoctor(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 更新健康管理员
    @PutMapping("modify")
    public ResultObject modify(@RequestBody Doctor doctor) {
        int modifyId = doctorService.updateDoctor(doctor);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 查询健康管理员
    @GetMapping("/find")
    public ResultObject find(@RequestParam Integer id) {
        Doctor doctor = doctorService.selectDoctor(id);
        Map<String, Doctor> map = new HashMap<>();
        map.put("doctor", doctor);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }
}
