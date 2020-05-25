package io.xiaowei.hystrix;

import io.xiaowei.feign.StorageFeignClient;
import io.xiaowei.storage.Storage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName StorageHystrix
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 7:35 下午
 * @Version 1.0
 **/
@Slf4j
@Component
public class StorageHystrix implements StorageFeignClient {
    @Override
    public Storage save(Storage record) {
        return null;
    }

    @Override
    public Storage findById(Long id) {
        return null;
    }

    @Override
    public Storage update(Storage record) {
        return null;
    }

    @Override
    public List<Storage> findAll() {
        return null;
    }

    @Override
    public void reduce(Long id, Integer count) {
        log.error("服务降级");
    }
}
