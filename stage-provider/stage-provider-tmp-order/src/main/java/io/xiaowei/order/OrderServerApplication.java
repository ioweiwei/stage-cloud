package io.xiaowei.order;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @ClassName OrderServerApplication
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 2:08 上午
 * @Version 1.0
 **/
@Slf4j
@SpringBootApplication
@EnableEurekaClient
@EnableJpaAuditing
@EnableAutoDataSourceProxy(useJdkProxy = true)
@EntityScan(basePackages = {"io.xiaowei"})
@EnableFeignClients(basePackages = {"io.xiaowei"})
public class OrderServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServerApplication.class, args);
    }
}
