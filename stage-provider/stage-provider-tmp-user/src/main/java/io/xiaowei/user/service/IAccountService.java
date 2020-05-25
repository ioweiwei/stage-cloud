package io.xiaowei.user.service;

import io.xiaowei.account.Account;
import io.xiaowei.core.IBaseService;

import java.math.BigDecimal;

public interface IAccountService<T> extends IBaseService<Account> {
    void debit(Long userId, BigDecimal money);
}
