package io.xiaowei.order;

import io.xiaowei.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @ClassName Order
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 1:52 下午
 * @Version 1.0
 **/
@Setter
@Getter
@Entity
@Table(name = "tb_order")
public class Order extends BaseEntity {

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 商品id
     */
    private Long goodsId;

}
