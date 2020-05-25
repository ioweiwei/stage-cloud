package io.xiaowei.user;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @ClassName UserServerApplication
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/24 2:08 上午
 * @Version 1.0
 **/
@Slf4j
@SpringBootApplication
@EnableEurekaClient
@EnableAutoDataSourceProxy(useJdkProxy = true)
@EnableJpaAuditing
@EntityScan(basePackages = {"io.xiaowei"})
public class UserServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServerApplication.class, args);
    }
}
