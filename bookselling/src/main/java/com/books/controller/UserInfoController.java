package com.books.controller;

import com.books.domain.HttpResult;
import com.books.domain.UserInfo;
import com.books.service.impl.UserInfoServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/userinfo")
public class UserInfoController {
    @Autowired
    private UserInfoServiceImpl service;

    /**
     * 查询用户信息列表
     */
    @ApiOperation("查询用户信息列表")
    @GetMapping("/list")
    public List<UserInfo> list(UserInfo userInfo)
    {
        List<UserInfo> list = service.selectUserInfoList(userInfo);
        return list;
    }

    /**
     * 获取用户信息详细信息
     */
    @ApiOperation("获取用户信息详细信息")
    @GetMapping(value = "/{userId}")
    public UserInfo getInfo(@PathVariable("userId") Long userId)
    {
        return service.selectUserInfoByUserId(userId);
    }

    /**
     * 新增用户信息
     */
    @ApiOperation("新增用户信息")
    @PostMapping
    public int add(@RequestBody UserInfo userInfo)
    {
        return service.insertUserInfo(userInfo);
    }

    /**
     * 修改用户信息
     */
    @ApiOperation("修改用户信息")
    @PutMapping
    public int edit(@RequestBody UserInfo userInfo)
    {
        return service.updateUserInfo(userInfo);
    }

    /**
     * 删除用户信息
     */
    @ApiOperation("删除用户信息")
    @DeleteMapping("/{userIds}")
    public int remove(@PathVariable Long[] userIds)
    {
        return (service.deleteUserInfoByUserIds(userIds));
    }

    /**
     * 登录
     */
    @ApiOperation("登录")
    @PostMapping("/login")
    public HttpResult login(@RequestBody UserInfo userInfo)
    {
        Long userId = userInfo.getUserId();
        String checkPassword = service.getPwdByUserId(userId);
        if (checkPassword == null || checkPassword.equals("")) {
            return new HttpResult(false, "用户不存在", null);
        }else if (checkPassword.equals(userInfo.getPassword())) {
            return new HttpResult(true, "登录成功", service.selectUserInfoByUserId(userId));
        }else {
            return new HttpResult(false, "密码错误", null);
        }
    }
}
