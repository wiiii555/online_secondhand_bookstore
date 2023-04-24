package com.books.service.impl;

import com.books.domain.UserInfo;
import com.books.mapper.UserInfoMapper;
import com.books.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private UserInfoMapper mapper;

    @Override
    public UserInfo selectUserInfoByUserId(Long userId) {
        return mapper.selectUserInfoByUserId(userId);
    }

    public UserInfo selectUserInfoByUserCode(String userCode) {
        return mapper.selectUserInfoByUserCode(userCode);
    }

    public List<UserInfo> selectUserInfoList(UserInfo userInfo) {
        return mapper.selectUserInfoList(userInfo);
    }

    public int insertUserInfo(UserInfo userInfo) {
        return mapper.insertUserInfo(userInfo);
    }

    public int updateUserInfo(UserInfo userInfo) {
        return mapper.updateUserInfo(userInfo);
    }

    public int deleteUserInfoByUserIds(Long[] userIds) {
        return mapper.deleteUserInfoByUserIds(userIds);
    }

    public int deleteUserInfoByUserId(Long userId) {
        return mapper.deleteUserInfoByUserId(userId);
    }
}
