package io.xiaowei.core.request;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PageRequest
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/5/23 10:42 下午
 * @Version 1.0
 **/
@Setter
public class PageRequest {

    /**
     * 当前页码
     */
    private int pageNum = 0;
    /**
     * 每页数量
     */
    private int pageSize = 10;
    /**
     * 查询参数
     */
    private List<CoreParam> params = new ArrayList<>();

    /**
     * 查询参数对象
     *
     * @param name 参数名称
     * @return
     */
    public CoreParam getParam(String name) {
        for (CoreParam param : this.params) {
            if (name != null && name.equals(param.getName())) {
                return param;
            }
        }
        return null;
    }

    /**
     * 查询参数值
     *
     * @param name 参数名称
     * @return
     */
    public String getParamValue(String name) {
        CoreParam param = getParam(name);
        if (param != null) {
            return param.getValue();
        }
        return null;
    }


    public int getPageNum() {
        return pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }
}
