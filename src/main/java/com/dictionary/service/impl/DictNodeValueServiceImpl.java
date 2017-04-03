package com.dictionary.service.impl;

import com.dictionary.bean.DictNodeValueBean;
import com.dictionary.dao.DictNodeValueDao;
import com.dictionary.service.DictNodeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/3.
 */
@Service
public class DictNodeValueServiceImpl implements DictNodeValueService {
    @Autowired
    private DictNodeValueDao dictNodeValueDao;

    @Override
    public int insert(DictNodeValueBean dictNodeValueBean){
        return dictNodeValueDao.insert(dictNodeValueBean);
    }

    @Override
    public List<DictNodeValueBean> select(DictNodeValueBean dictNodeValueBean){
        return  dictNodeValueDao.select(dictNodeValueBean);
    }

    @Override
    public int update(DictNodeValueBean dictNodeValueBean){
        return dictNodeValueDao.update(dictNodeValueBean);
    }

    @Override
    public int delete(String id){
        return dictNodeValueDao.delete(id);
    }
}
