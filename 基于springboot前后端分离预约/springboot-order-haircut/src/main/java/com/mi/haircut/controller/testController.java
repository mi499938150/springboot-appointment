package com.mi.haircut.controller;

import com.mi.haircut.Vo.ResultVo;
import com.mi.haircut.domain.User;
import com.mi.haircut.exception.GlobalException;
import com.mi.haircut.utils.ResultVoUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author : Rong
 * @date : 2019/12/3
 * @Desc: 测试接口
 */



@RestController
@Slf4j
public class testController {

    @RequestMapping("/api/submitOrder")
    public ResultVo showUser(){
        log.info("submitOrder....");
        ResultVo result = new ResultVo();
        User user = new User();
        user.setId(1L);
        user.setName("1111");
        user.setPassword("!111");
        return ResultVoUtil.success(user);
    }

    @RequestMapping("/api/error")
    public String errorHandler(){

        throw new GlobalException("100","错误");
    }

    @RequestMapping("/api/test")
    public String test(Map<Object,Object> map){
        int i  =  1/0;
        map.put("name","张三");
        return "test";
    }

}