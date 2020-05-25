package io.xiaowei.core;

import io.xiaowei.core.request.PageRequest;
import io.xiaowei.core.utils.page.SimplePage;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author xiaowei_wang
 * @Description Base Service
 * @Date 10:13 下午 2020/5/23
 **/
public interface IBaseService<T> {

    /**
     * @return java.util.List<T>
     * @Author xiaowei_wang
     * @Description 无分页全部查询
     * @Date 10:17 下午 2020/5/23
     * @Param []
     **/
    List<T> findAll();

    /**
     * @return java.util.List<T>
     * @Author xiaowei_wang
     * @Description 无分页普通查询
     * @Date 10:16 下午 2020/5/23
     * @Param [record]
     **/
    List<T> findAll(PageRequest request);

    /**
     * @return io.xiaowei.core.utils.page.SimplePage<T>
     * @Author xiaowei_wang
     * @Description 分页查询
     * @Date 10:18 下午 2020/5/23
     * @Param [record]
     **/
    SimplePage<T> findPage(PageRequest request);

    /**
     * @return T
     * @Author xiaowei_wang
     * @Description 根据主键查询
     * @Date 10:17 下午 2020/5/23
     * @Param [id]
     **/
    T findById(Long id);

    /**
     * @return T
     * @Author xiaowei_wang
     * @Description 插入
     * @Date 10:24 下午 2020/5/23
     * @Param [record]
     **/
    @Transactional(rollbackFor = Exception.class)
    T save(T record);

    /**
     * @return T
     * @Author xiaowei_wang
     * @Description 修改
     * @Date 10:24 下午 2020/5/23
     * @Param [record]
     **/
    @Transactional(rollbackFor = Exception.class)
    T update(T record);

    /**
     * @return java.util.List<T>
     * @Author xiaowei_wang
     * @Description 批量插入
     * @Date 10:25 下午 2020/5/23
     * @Param [list]
     **/
    @Transactional(rollbackFor = Exception.class)
    List<T> batchSave(List<T> list);

    /**
     * @return java.util.List<T>
     * @Author xiaowei_wang
     * @Description 批量更新
     * @Date 10:26 下午 2020/5/23
     * @Param [list]
     **/
    @Transactional(rollbackFor = Exception.class)
    List<T> batchUpdate(List<T> list);

    /**
     * @return void
     * @Author xiaowei_wang
     * @Description 根据主键删除
     * @Date 10:27 下午 2020/5/23
     * @Param [record]
     **/
    @Transactional(rollbackFor = Exception.class)
    void deleteById(Long id);

    /**
     * @return void
     * @Author xiaowei_wang
     * @Description 批量删除
     * @Date 10:28 下午 2020/5/23
     * @Param [list]
     **/
    @Transactional(rollbackFor = Exception.class)
    void batchDelete(List<T> list);

}
