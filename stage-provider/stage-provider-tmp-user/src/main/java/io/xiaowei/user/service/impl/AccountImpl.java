package io.xiaowei.user.service.impl;

import io.xiaowei.account.Account;
import io.xiaowei.core.BaseServiceImpl;
import io.xiaowei.core.request.PageRequest;
import io.xiaowei.core.utils.page.SimplePage;
import io.xiaowei.user.repository.AccountRepository;
import io.xiaowei.user.service.IAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName AccountImpl
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 2:29 上午
 * @Version 1.0
 **/
@Slf4j
@Service
public class AccountImpl extends BaseServiceImpl<Account> implements IAccountService<Account> {

    @Resource
    private AccountRepository accountRepository;

    @Override
    public List<Account> findAll(PageRequest request) {
        return null;
    }

    @Override
    public SimplePage<Account> findPage(PageRequest request) {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void debit(Long userId, BigDecimal money) {
        log.info("用户账户扣减{}--{}", userId, money);
        Account account = findById(userId);
        if (account == null) {
            throw new RuntimeException("user not found");
        }
        account.setMoney(account.getMoney().subtract(money));
        save(account);
        if (userId == 5) {
            throw new RuntimeException("不允许id为5的用户");
        }
    }
}
