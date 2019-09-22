package com.idwxy.hmi.controller;

import com.idwxy.hmi.common.ResultObject;
import com.idwxy.hmi.entity.TransferDetail;
import com.idwxy.hmi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("transfer")
    public ResultObject add(@RequestBody TransferDetail transferDetail) {
        String status = accountService.transfer(transferDetail);
        ResultObject resultObject = new ResultObject(200, status, null);
        return resultObject;
    }
}
