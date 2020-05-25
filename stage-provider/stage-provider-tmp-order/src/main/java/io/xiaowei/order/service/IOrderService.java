package io.xiaowei.order.service;

import io.xiaowei.core.IBaseService;
import io.xiaowei.order.Order;

public interface IOrderService extends IBaseService<Order> {
    void create(Long userId, Integer count, Long goodsId);
}
