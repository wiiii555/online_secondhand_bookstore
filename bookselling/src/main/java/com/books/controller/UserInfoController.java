package com.books.controller;

import com.books.domain.UserInfo;
import com.books.service.impl.UserInfoServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
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
    @GetMapping(value = "/{userCode}")
    public UserInfo getInfo(@PathVariable("userCode") String userCode)
    {
        return service.selectUserInfoByUserCode(userCode);
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

}
