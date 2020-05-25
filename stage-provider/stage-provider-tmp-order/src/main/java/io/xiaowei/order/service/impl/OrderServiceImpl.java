package io.xiaowei.order.service.impl;

import io.seata.spring.annotation.GlobalTransactional;
import io.xiaowei.core.BaseServiceImpl;
import io.xiaowei.core.request.PageRequest;
import io.xiaowei.core.utils.page.SimplePage;
import io.xiaowei.feign.StorageFeignClient;
import io.xiaowei.order.Order;
import io.xiaowei.order.service.IOrderService;
import io.xiaowei.user.feign.UserFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 1:56 下午
 * @Version 1.0
 **/
@Slf4j
@Service
public class OrderServiceImpl extends BaseServiceImpl<Order> implements IOrderService {

    @Resource
    private UserFeignClient userFeignClient;

    @Resource
    private StorageFeignClient storageFeignClient;

    @Override
    public List<Order> findAll(PageRequest request) {
        return null;
    }

    @Override
    public SimplePage<Order> findPage(PageRequest request) {
        return null;
    }

    @Override
    @GlobalTransactional(timeoutMills = 3000)
    public void create(Long userId, Integer count, Long goodsId) {
        BigDecimal sumMoney = new BigDecimal(count).multiply(new BigDecimal(10));
        userFeignClient.debit(userId, sumMoney);
        //money
        Order order = new Order();
        order.setUserId(userId);
        order.setCount(count);
        order.setGoodsId(goodsId);
        order.setMoney(sumMoney);
        save(order);
        //扣减库存
        storageFeignClient.reduce(goodsId, count);
        if (count == 1) {
            throw new RuntimeException("出错!");
        }
    }
}
