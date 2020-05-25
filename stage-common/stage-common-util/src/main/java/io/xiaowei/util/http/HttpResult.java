package io.xiaowei.util.http;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author xiaowei_wang
 * @Description Response Result
 * @Date 1:31 下午 2020/5/7
 **/
@Setter
@Getter
public class HttpResult implements Serializable {
    private int code = 200;
    private String message;
    private Object data;
}
