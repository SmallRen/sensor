package com.sensor.controller;


import com.sensor.entity.User;
import com.sensor.service.IUserService;
import com.sensor.utils.ResponseCode;
import com.sensor.utils.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户登录模块
 * </p>
 *
 * @author sensor
 * @since 2019-03-14
 */
@Api(tags = {"用户登录模块"})
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    /**
     * 登录方法
     *
     * @param username
     * @param password
     * @return
     */

    @ApiOperation(value = "用户登录", notes = "根据用户和密码进行登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = true, paramType = "form", dataType = "String")
    })
    @PostMapping("/login")
    public ResponseResult<User> login(@RequestParam("username") String username, @RequestParam("password") String password) {
        return ResponseResult.e(ResponseCode.OK, userService.login(username, password));
    }

    /**
     * 检查用户名是否存在
     *
     * @param username
     * @return
     */

    @ApiOperation(value = "检查用户名是否存在", notes = "检查用户名是否存在")
    @ApiImplicitParam(name = "username", value = "用户名", required = true, paramType = "form", dataType = "String")
    @GetMapping("/checkUser")
    public ResponseResult<Boolean> checkUser(@RequestParam("username") String username) {
        return ResponseResult.e(ResponseCode.OK, userService.checkUserName(username));
    }

    /**
     * 用户注册
     *
     * @param username
     * @return
     */
    @ApiOperation(value = "用户注册", notes = "根据用户和密码和身份证进行注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = true, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "card", value = "身份证号", required = true, paramType = "form", dataType = "String")
    })
    @PostMapping("/save")
    public ResponseResult<Boolean> save(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("card") String card) {

        return ResponseResult.e(ResponseCode.OK, userService.save(username, password, card));
    }
}
