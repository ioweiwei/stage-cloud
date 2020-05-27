package io.xiaowei;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName AdminServerApplication
 * @Description 启动类
 * @Author xiaowei
 * @Date 2020/5/4 10:34 下午
 * @Version 1.0
 **/
@Slf4j
@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
public class AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
        log.info(">>>>>>>> Admin Server Start Success >>>>>>>>");
    }

}
