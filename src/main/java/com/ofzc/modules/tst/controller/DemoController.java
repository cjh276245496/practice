package com.ofzc.modules.tst.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.mybatis.spring.mapper.ClassPathMapperScanner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cjh27
 * @Date: 2019/2/14
 */

@RestController
@Api(tags = {"测试"})
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassPathMapperScanner.class);
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ApiOperation(value = "嗨喽 ", notes =
            "1. jjjjjj      \n" +
            "2. kkkkk       \n" +
            "3. lllll       \n" +
            "4. ooooo       \n")
    public  void  hello(){

        //LOGGER.warn();

    }
}
