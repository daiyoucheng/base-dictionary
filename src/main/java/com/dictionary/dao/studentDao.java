package com.dictionary.dao;

import com.dictionary.bean.student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2017/3/27.
 */
@Mapper
public interface studentDao {
    List<student> search(student student);
}
