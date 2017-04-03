package com.dictionary.Controller;

import com.dictionary.bean.DictLeafNodeBean;
import com.dictionary.service.DictLeafNodeService;
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
import java.util.UUID;

/**
 * Created by Administrator on 2017/3/27.
 */
@Controller
@RequestMapping("/dictionaryDictLeaf")
@Api(value = "DictLeafCode")
public class DictLeafNodeController {
    private static final Logger logger = LoggerFactory.getLogger(DictLeafNodeController.class);
    @Autowired
    DictLeafNodeService dictLeafNodeService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "插入")
    public String insert(@RequestBody DictLeafNodeBean dictLeafNodeBean) {
        String id = UUID.randomUUID().toString();
        dictLeafNodeBean.setDictId(id);
        logger.info(dictLeafNodeBean.toString());
        dictLeafNodeService.insert(dictLeafNodeBean);
        return id;
    }

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询")
    public List<DictLeafNodeBean> search(@RequestBody DictLeafNodeBean dictLeafNodeBean){
       List<DictLeafNodeBean> dictLeafNodeBeanList =  dictLeafNodeService.search(dictLeafNodeBean);
       return dictLeafNodeBeanList;
    }


    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "更新")
    public int update(@RequestBody DictLeafNodeBean dictLeafNodeBean){
        return dictLeafNodeService.update(dictLeafNodeBean);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "删除")
    public int delete(@RequestBody String id){
        return dictLeafNodeService.delete(id);
    }
}
