package com.idwxy.hmi.controller;

import com.idwxy.hmi.common.ResultObject;
import com.idwxy.hmi.entity.User;
import com.idwxy.hmi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 新建用户
    @PostMapping("/add")
    public ResultObject add(@RequestBody User user) {
        int modifyId = userService.insert(user);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 删除用户
    @DeleteMapping("/delete")
    public ResultObject delete(@RequestParam Integer id) {
        int modifyId = userService.deleteUser(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 更新用户
    @PutMapping("/modify")
    public ResultObject modify(@RequestBody User user) {
        int modifyId = userService.updateUser(user);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 查询用户
    @GetMapping("/find")
    public ResultObject find(@RequestParam Integer id) d{
        User user = userService.selectUser(id);
        Map<String, User> map = new HashMap<>();
        map.put("user", user);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }
}
