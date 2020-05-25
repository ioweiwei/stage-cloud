package io.xiaowei.user.controller;

import io.xiaowei.account.Account;
import io.xiaowei.core.BaseController;
import io.xiaowei.user.service.IAccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @ClassName AccountController
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 2:22 上午
 * @Version 1.0
 **/
@RestController
@RequestMapping("user")
public class AccountController extends BaseController<Account> {

    @Resource
    private IAccountService<Account> IAccountService;

    @GetMapping("/debit")
    public Boolean debit(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        IAccountService.debit(userId, money);
        return true;
    }

}
