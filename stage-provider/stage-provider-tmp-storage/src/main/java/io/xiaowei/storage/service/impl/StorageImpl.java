package io.xiaowei.storage.service.impl;

import io.xiaowei.core.BaseServiceImpl;
import io.xiaowei.core.request.PageRequest;
import io.xiaowei.core.utils.page.SimplePage;
import io.xiaowei.storage.Storage;
import io.xiaowei.storage.service.IStorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName StorageImpl
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 2:30 下午
 * @Version 1.0
 **/
@Slf4j
@Service
public class StorageImpl extends BaseServiceImpl<Storage> implements IStorageService {
    @Override
    public List<Storage> findAll(PageRequest request) {
        return null;
    }

    @Override
    public SimplePage<Storage> findPage(PageRequest request) {
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void reduce(Long id, Integer count) {
        Storage storage = findById(id);
        if (storage == null) {
            throw new RuntimeException("库存商品不存在");
        }
        if (storage.getCount() < count) {
            throw new RuntimeException("库存不足");
        }
        storage.setCount(storage.getCount() - count);
        update(storage);
        log.info(">>>>>>>>>>> 库存扣减成功 >>>>>>>>>");
    }
}
