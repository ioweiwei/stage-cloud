package io.xiaowei.core.utils.query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;


/**
 * @Author xiaowei_wang
 * @Description
 * @Date 7:22 下午 2020/5/7
 * @Param
 * @return
 **/
public class SimpleSelector implements MySelector {
    /**
     * 属性名
     */
    private String fieldName;
    private Operator operator;

    public SimpleSelector(String fieldName, Operator operator) {
        this.fieldName = fieldName;
        this.operator = operator;
    }

    @Override
    public Selection getSelection(Root root, CriteriaBuilder builder) {
        Path expression = root.get(fieldName);

        switch (operator) {
            case COUNT:
                return builder.count(expression);
            case COUNT_DISTINCT:
                return builder.countDistinct(expression);
            case AVG:
                return builder.avg(expression);
            case SUM:
                return builder.sum(expression);
            case MAX:
                return builder.max(expression);
            case MIN:
                return builder.min(expression);
            default:
                return null;
        }
    }
}
