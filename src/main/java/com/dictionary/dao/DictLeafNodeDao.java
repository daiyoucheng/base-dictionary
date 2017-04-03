package com.dictionary.dao;

import com.dictionary.bean.DictLeafNodeBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2017/3/30.
 */
@Mapper
public interface DictLeafNodeDao {
    int insert(DictLeafNodeBean dictLeafNodeBean);

    List<DictLeafNodeBean> search(DictLeafNodeBean dictLeafNodeBean);

    int update(DictLeafNodeBean dictLeafNodeBean);

    int delete(String id);
}
