package com.dictionary.service.impl;

import com.dictionary.dao.*;
import com.dictionary.bean.student;
import com.dictionary.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/27.
 */
@Service
public class studentServiceImpl implements studentService {
    @Autowired
    private studentDao studentDao;

    public List<student> search(student student) {
        List<student> students = studentDao.search(student);
        return students;
    }
}
