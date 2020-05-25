package io.xiaowei.core;

import io.xiaowei.util.http.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author xiaowei_wang
 * @Description 对外
 * @Date 7:19 下午 2020/5/24
 * @Param
 * @return
 **/
public interface IBaseController<T> {

    @PostMapping(value = "/save")
    HttpResult save(@RequestBody T record);

    @GetMapping(value = "/find/{id}")
    HttpResult findById(@PathVariable(value = "id") Long id);

    @PostMapping(value = "/update")
    HttpResult update(@RequestBody T record);

    @GetMapping(value = "find/all")
    HttpResult findAll();
}
