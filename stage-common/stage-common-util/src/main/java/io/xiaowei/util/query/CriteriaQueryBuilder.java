package io.xiaowei.util.query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;
import java.util.List;

/**
 * @Author xiaowei_wang
 * @Description 适用于对单表做sum、avg、count等运算时使用，并且查询条件不固定，需要动态生成predicate
 * 如select sum(a), count(b), count distinct(c) from table where a = ? & b = ?
 * @Date 7:24 下午 2020/5/7
 * @Param
 * @return
 **/
public interface CriteriaQueryBuilder<T> {
    List<Selection<T>> buildSelections(CriteriaBuilder builder, Root<T> root);

    Predicate buildPredicate(CriteriaBuilder builder, Root<T> root);
}
