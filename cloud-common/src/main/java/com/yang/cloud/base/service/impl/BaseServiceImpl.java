package com.yang.cloud.base.service.impl;

import com.yang.cloud.base.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by yang on 2018/07/22-0022.
 */
public class BaseServiceImpl<T> implements IBaseService<T> {
    @Autowired
    protected Mapper<T> mapper;

    public T insert(T t) {
        mapper.insert(t);
        return t;
    }

    public T insertSelective(T t) {
        mapper.insertSelective(t);
        return t;
    }

    public int delete(T t) {
        return mapper.delete(t);
    }

    public int deleteByPrimaryKey(Object o) {
        return mapper.deleteByPrimaryKey(o);
    }

    public T updateByPrimaryKey(T t) {
        mapper.updateByPrimaryKey(t);
        return t;
    }

    public T updateByPrimaryKeySelective(T t) {
        mapper.updateByPrimaryKeySelective(t);
        return t;
    }

    public List<T> select(T t) {
        return mapper.select(t);
    }

    public T selectByPrimaryKey(Object o) {
        return mapper.selectByPrimaryKey(o);
    }
}
