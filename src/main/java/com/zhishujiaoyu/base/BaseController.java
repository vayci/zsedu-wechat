package com.zhishujiaoyu.base;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

/**
 * @author zhaohw
 * @date 2017-10-14 12:17
 */
public class BaseController<Biz extends BaseBiz,Entity> {
        @Autowired
        protected HttpServletRequest request;
        @Autowired
        protected Biz baseBiz;

        @ApiOperation(value = "新增")
        @RequestMapping(value = "",method = RequestMethod.POST)
        @ResponseBody
        public ObjectRestResponse<Entity> add(@RequestBody @Valid Entity entity, BindingResult bindingResult){
           baseBiz.insertSelective(entity);
            return new ObjectRestResponse<Entity>().rel(true);
        }

        @ApiOperation(value = "通过id查询")
        @RequestMapping(value = "/{id}",method = RequestMethod.GET)
        @ResponseBody
        public ObjectRestResponse<Entity> get(@PathVariable Object id){
            int intId  = Integer.parseInt(id.toString());
            return new ObjectRestResponse<Entity>().rel(true).data(baseBiz.selectById(intId));
        }

        @ApiOperation(value = "通过id更新")
        @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
        @ResponseBody
        public ObjectRestResponse<Entity> update(@RequestBody @Valid Entity entity, BindingResult bindingResult){
            baseBiz.updateSelectiveById(entity);
            return new ObjectRestResponse<Entity>().rel(true);
        }

        @ApiOperation(value = "通过id删除")
        @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
        @ResponseBody
        public ObjectRestResponse<Entity> remove(@PathVariable Object id){
            int intId  = Integer.parseInt(id.toString());
            baseBiz.deleteById(intId);
            return new ObjectRestResponse<Entity>().rel(true);
        }

        @ApiOperation(value = "查询所有")
        @RequestMapping(value = "/all",method = RequestMethod.GET)
        @ResponseBody
        public List<Entity> all(){
            return baseBiz.selectListAll();
        }

}
