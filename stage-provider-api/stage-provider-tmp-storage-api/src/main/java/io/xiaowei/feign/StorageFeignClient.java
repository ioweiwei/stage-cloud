package io.xiaowei.feign;

import io.xiaowei.core.IBaseFeign;
import io.xiaowei.hystrix.StorageHystrix;
import io.xiaowei.storage.Storage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "stage-provider-tmp-storage/storage", fallback = StorageHystrix.class)
public interface StorageFeignClient extends IBaseFeign<Storage> {

    @GetMapping("/reduce")
    void reduce(@RequestParam("id") Long id, @RequestParam("count") Integer count);

}
