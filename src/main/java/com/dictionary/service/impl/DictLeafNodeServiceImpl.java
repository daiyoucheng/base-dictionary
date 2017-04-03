package com.dictionary.service.impl;

import com.dictionary.bean.DictLeafNodeBean;
import com.dictionary.dao.DictLeafNodeDao;
import com.dictionary.service.DictLeafNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/27.
 */
@Service
public class DictLeafNodeServiceImpl implements DictLeafNodeService {
    @Autowired
    private DictLeafNodeDao dictLeafNodeDao;

    @Override
    public int insert(DictLeafNodeBean dictLeafNodeBean) {
        int count = dictLeafNodeDao.insert(dictLeafNodeBean);
        return count;
    }

    @Override
    public List<DictLeafNodeBean> search(DictLeafNodeBean dictLeafNodeBean) {
        return dictLeafNodeDao.search(dictLeafNodeBean);
    }

    @Override
    public int update(DictLeafNodeBean dictLeafNodeBean) {
        return dictLeafNodeDao.update(dictLeafNodeBean);
    }

    @Override
    public int delete(String id){
        return dictLeafNodeDao.delete(id);
    }
}
