package com.idwxy.hmi.service;

import com.idwxy.hmi.entity.TransferDetail;

public interface AccountService {

    /**
     * 转账
     * @param transferDetail
     * @return
     */
    String transfer(TransferDetail transferDetail);
}
