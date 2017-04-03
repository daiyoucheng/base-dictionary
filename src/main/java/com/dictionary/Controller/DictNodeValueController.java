package com.dictionary.Controller;

import com.dictionary.bean.DictNodeValueBean;
import com.dictionary.service.DictNodeValueService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/4/3.
 */
@RequestMapping("/dictionaryDictNode")
@Api(value = "DictNode")
@Controller
public class DictNodeValueController {
    @Autowired
    DictNodeValueService dictNodeValueService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody DictNodeValueBean dictNodeValueBean){
        return  dictNodeValueService.insert(dictNodeValueBean);
    }

    @RequestMapping("/select")
    @ResponseBody
    public List<DictNodeValueBean> select(@RequestBody DictNodeValueBean dictNodeValueBean){
        return dictNodeValueService.select(dictNodeValueBean);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody DictNodeValueBean dictNodeValueBean){
        return dictNodeValueService.update(dictNodeValueBean);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestBody String id){
        return dictNodeValueService.delete(id);
    }
}
