package io.xiaowei.storage.controller;

import io.xiaowei.core.BaseController;
import io.xiaowei.storage.Storage;
import io.xiaowei.storage.service.IStorageService;
import io.xiaowei.util.http.HttpResult;
import io.xiaowei.util.http.ResultGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName StorageController
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 2:29 下午
 * @Version 1.0
 **/
@RestController
@RequestMapping("storage")
public class StorageController extends BaseController<Storage> {

    @Resource
    private IStorageService storageService;

    @GetMapping("/reduce")
    public HttpResult reduce(@RequestParam("id") Long id, @RequestParam("count") Integer count) {
        try {
            storageService.reduce(id, count);
            return ResultGenerator.genSuccessResult();
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }

}
