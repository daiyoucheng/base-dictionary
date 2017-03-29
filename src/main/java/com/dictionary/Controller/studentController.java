package com.dictionary.Controller;

import com.dictionary.bean.student;
import com.dictionary.service.studentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/3/27.
 */
@Controller
@RequestMapping("/student")
@Api
public class studentController {
    private static final Logger logger = LoggerFactory.getLogger(studentController.class);
    @Autowired
    studentService studentService;

    /*@RequestMapping(value = "/user")
    @ResponseBody
    public String user() {
        student student = studentMapper.findUserByName("41311P02");
        return student.getName() + "-----" + student.getAge();
    }*/

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询" )
    public List<student> search(@RequestBody student student) {
        logger.info(student.toString());
        return studentService.search(student);
    }
}
