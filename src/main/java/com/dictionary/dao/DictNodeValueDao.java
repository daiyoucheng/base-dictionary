package com.dictionary.dao;

import com.dictionary.bean.DictNodeValueBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2017/4/3.
 */
@Mapper
public interface DictNodeValueDao {
    int insert(DictNodeValueBean dictNodeValueBean);

    List<DictNodeValueBean> select(DictNodeValueBean dictNodeValueBean);

    int update(DictNodeValueBean dictNodeValueBean);

    int delete(String id);
}
