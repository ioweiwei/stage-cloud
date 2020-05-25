package io.xiaowei.core;

import io.xiaowei.util.http.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author xiaowei_wang
 * @Description 对内
 * @Date 7:27 下午 2020/5/24
 * @Param
 * @return
 **/
public interface IBaseFeign<T> {

    @PostMapping(value = "/save")
    T save(@RequestBody T record);

    @GetMapping(value = "/find/{id}")
    T findById(@PathVariable(value = "id") Long id);

    @PostMapping(value = "/update")
    T update(@RequestBody T record);

    @GetMapping(value = "find/all")
    List<T> findAll();

}
