package io.xiaowei.user.hystrix;

import io.xiaowei.account.Account;
import io.xiaowei.user.feign.UserFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName UserHystrix
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 7:31 下午
 * @Version 1.0
 **/
@Slf4j
@Component
public class UserHystrix implements UserFeignClient {
    @Override
    public Boolean debit(Long userId, BigDecimal money) {
        log.error("-------服务降级-------");
        return null;
    }

    @Override
    public Account save(Account record) {
        return null;
    }

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public Account update(Account record) {
        return null;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }
}
