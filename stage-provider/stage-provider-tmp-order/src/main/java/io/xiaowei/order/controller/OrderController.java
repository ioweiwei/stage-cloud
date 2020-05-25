package io.xiaowei.order.controller;

import io.xiaowei.core.BaseController;
import io.xiaowei.order.Order;
import io.xiaowei.order.service.IOrderService;
import io.xiaowei.util.http.HttpResult;
import io.xiaowei.util.http.ResultGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 1:51 下午
 * @Version 1.0
 **/
@RestController
@RequestMapping("order")
public class OrderController extends BaseController<Order> {

    @Resource
    private IOrderService orderService;

    @GetMapping("create")
    public HttpResult create(@RequestParam("userId") Long userId, @RequestParam("count") Integer count, @RequestParam("goodsId") Long goodsId) {
        try {
            orderService.create(userId, count, goodsId);
            return ResultGenerator.genSuccessResult();
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }

}
