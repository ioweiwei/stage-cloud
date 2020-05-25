package io.xiaowei.core;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName BaseServiceImpl
 * @Description Base Service
 * @Author xiaowei
 * @Date 2020/5/23 10:48 下午
 * @Version 1.0
 **/
@Slf4j
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    @Resource
    private BaseJpaRepository<T> baseJpaRepository;

    @Override
    public List<T> findAll() {
        return baseJpaRepository.findAll();
    }

    @Override
    public T findById(Long id) {
        Optional<T> optional = baseJpaRepository.findById(id);
        if (!optional.isPresent()) {
            throw new RuntimeException("结果不存在");
        }
        return optional.get();
    }

    @Override
    public T save(T record) {
        return baseJpaRepository.save(record);
    }

    @Override
    public T update(T record) {
        return baseJpaRepository.saveAndFlush(record);
    }

    @Override
    public List<T> batchSave(List<T> list) {
        return baseJpaRepository.saveAll(list);
    }

    @Override
    public List<T> batchUpdate(List<T> list) {
        return baseJpaRepository.saveAll(list);
    }

    @Override
    public void deleteById(Long id) {
        baseJpaRepository.deleteById(id);
    }

    @Override
    public void batchDelete(List<T> list) {
        baseJpaRepository.deleteAll(list);
    }
}
