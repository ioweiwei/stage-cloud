package io.xiaowei.storage.service;

import io.xiaowei.core.IBaseService;
import io.xiaowei.storage.Storage;

public interface IStorageService extends IBaseService<Storage> {

    void reduce(Long id, Integer count);
}
