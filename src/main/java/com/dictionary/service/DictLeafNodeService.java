package com.dictionary.service;

import com.dictionary.bean.DictLeafNodeBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/27.
 */
@Service
public interface DictLeafNodeService {

    int insert(DictLeafNodeBean dictLeafNodeBean);

    List<DictLeafNodeBean> search(DictLeafNodeBean dictLeafNodeBean);

    int update(DictLeafNodeBean dictLeafNodeBean);

    int delete(String id);
}
