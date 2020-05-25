package io.xiaowei.user.feign;

import io.xiaowei.account.Account;
import io.xiaowei.core.IBaseFeign;
import io.xiaowei.user.hystrix.UserHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "stage-provider-tmp-user/user", fallback = UserHystrix.class)
public interface UserFeignClient extends IBaseFeign<Account> {

    @GetMapping("/debit")
    Boolean debit(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
