package com.dictionary.service;

import com.dictionary.bean.DictNodeValueBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/3.
 */
@Service
public interface DictNodeValueService {
    int insert(DictNodeValueBean dictNodeValueBean);

    List<DictNodeValueBean> select(DictNodeValueBean dictNodeValueBean);

    int update(DictNodeValueBean dictNodeValueBean);

    int delete(String id);
}
