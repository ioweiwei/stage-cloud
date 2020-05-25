package io.xiaowei.util.query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

/**
 * @Author xiaowei_wang
 * @Description 要筛选的列，或者表达式（平均数、sum等）
 * @Date 7:23 下午 2020/5/7
 * @Param
 * @return
 **/
public interface MySelector {

    Selection getSelection(Root<?> root, CriteriaBuilder builder);

    enum Operator {
        COUNT, COUNT_DISTINCT, SUM, AVG, MAX, MIN
    }

}
