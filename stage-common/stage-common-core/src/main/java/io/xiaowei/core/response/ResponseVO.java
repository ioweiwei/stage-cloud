package io.xiaowei.core.response;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @ClassName ResponseVO
 * @Description response
 * @Author xiaowei
 * @Date 2020/5/23 10:39 下午
 * @Version 1.0
 **/
@Setter
@Getter
public class ResponseVO implements Serializable {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}
