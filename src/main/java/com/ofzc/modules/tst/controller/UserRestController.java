package com.ofzc.modules.tst.controller;

import com.ofzc.common.Result;
import com.ofzc.modules.tst.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: cjh27
 * @Date: 2019/3/6
 */
@RestController
@RequestMapping
@Api(tags = "用户Restful Api")
public class UserRestController {

    /*
     *   写 restful 风格的 crud api
     * */

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ApiOperation(value = "新增用户")
    public Result addUser(@RequestBody User user) {

        return null;
    }


    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除用户")
    public Result deleteUser(Long id) {


        return null;
    }


    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @ApiOperation(value = "修改用户")
    public Result updateUser(@RequestBody User user) {


        return null;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "查询用户")
    public Result queryUser(@PathVariable(value = "id") Long id) {


        return null;
    }


    @RequestMapping(value = "/queryUsers", method = RequestMethod.GET)
    @ApiOperation(value = "查询用户列表分页")
    public Result queryUser() {

        //MP 自动分页

        return null;
    }

}
