package com.books.domain;

public class UserInfo extends Entity{
    /** 用户id */
    private Long userId;

    /** 用户名 */
    private String userName;

    /** 账号 */
    private String userCode;

    /** 个人简介 */
    private String bio;

    /** 用户职责 */
    private int userRole;

    /** 头像url */
    private String avatarImg;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }


    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public String getAvatarImg() {
        return avatarImg;
    }

    public void setAvatarImg(String avatarImg) {
        this.avatarImg = avatarImg;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", bio='" + bio + '\'' +
                ", userRole=" + userRole +
                ", avatarImg='" + avatarImg + '\'' +
                '}';
    }
}
