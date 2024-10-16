package com.big.service.impl;

import com.big.mapper.AccountMapper;
import com.big.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Yin
 * @date 2024-10-14 16:18
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

//    public void setAccountMapper(AccountMapper accountMapper) {
//        this.accountMapper = accountMapper;
//    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ, readOnly = false, timeout = 3, propagation = Propagation.REQUIRED)
    public void transAccount(String deAccountName, String inAccountName, Integer money) {
        accountMapper.decrMoney(deAccountName, money);
//        int a = 1 / 0;
        accountMapper.incrMoney(inAccountName, money);
    }
}
