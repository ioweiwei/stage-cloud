package io.xiaowei.core.utils.page;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author xiaowei_wang
 * @Description jpa封装page
 * @Date 6:55 下午 2020/5/7
 **/
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SimplePage<T> {

    private int totalPage;
    private long totalCount;
    private List<T> list;

    public SimplePage(Page<T> page) {
        this.totalCount = page.getTotalElements();
        this.totalPage = page.getTotalPages();
        this.list = page.getContent();
    }
}
