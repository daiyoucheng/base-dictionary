package com.dictionary.service;

import com.dictionary.bean.student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/27.
 */
@Service
public interface studentService {
    List<student> search(student student);
}
