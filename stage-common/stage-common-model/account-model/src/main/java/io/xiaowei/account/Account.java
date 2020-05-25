package io.xiaowei.account;

import io.xiaowei.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @ClassName Account
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 1:53 上午
 * @Version 1.0
 **/
@Setter
@Getter
@Table(name = "tb_account")
@Entity
public class Account extends BaseEntity {

    private String name;

    private BigDecimal money;

}
