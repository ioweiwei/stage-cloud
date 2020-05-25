package io.xiaowei.storage;

import io.xiaowei.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ClassName Storage
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 2:23 下午
 * @Version 1.0
 **/
@Setter
@Getter
@Entity
@Table(name = "tb_storage")
public class Storage extends BaseEntity {

    /**
     * 库存
     */
    private Integer count;

    /**
     * 编码
     */
    private String code;

}
