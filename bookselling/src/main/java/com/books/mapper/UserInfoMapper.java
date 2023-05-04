package com.books.mapper;

import com.books.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    List<UserInfo> selectUserInfoList(UserInfo user);

    UserInfo selectUserInfoByUserId(Long userId);

    String getPwdByUserId(Long userId);

    int insertUserInfo(UserInfo user);

    int updateUserInfo(UserInfo user);

    int deleteUserInfoByUserId(Long userId);

    int deleteUserInfoByUserIds(Long[] userIds);
}
