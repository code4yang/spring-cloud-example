package com.yang.cloud.base.service;

import java.util.List;

/**
 * Created by yang on 2018/07/22-0022.
 */
public interface IBaseService<T> {
    T insert(T t);

    T insertSelective(T t);

    int delete(T t);

    int deleteByPrimaryKey(Object o);

    T updateByPrimaryKey(T t);

    T updateByPrimaryKeySelective(T t);

    List<T> select(T t);

    T selectByPrimaryKey(Object o);
}
